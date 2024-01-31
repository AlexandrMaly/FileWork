package App;

import Service.FileReadService;
import Service.FileWriterService;
import utils.Constants;

import java.util.Scanner;


public class Application {
    private static Scanner sc = new Scanner(System.in);
    private static String nameFile;
    private static String contentText;

    public static void appStart() {
        System.out.println("""
                Choose whether you want to:
                1 - create file and write something;
                2 - read the file
                """);
        try {
            int option = Integer.parseInt(sc.nextLine());
            if (option == 1) {
                createFile();
            } else if (option == 2) {
                readFile();
            } else
                System.out.println("You entered incorrect number");
        } catch (NumberFormatException e) {
            System.out.println("You entered not number");
        }
    }



    private static void createFile() {
        System.out.println("Enter the file name: ");
        nameFile = sc.nextLine();
        System.out.println("Enter the text in file: ");
        contentText = sc.nextLine();
        FileWriterService fws = new FileWriterService();
        fws.createFile(nameFile, contentText);
    }

    private static void readFile() {
        FileReadService frs = new FileReadService();
        System.out.println("Enter the file name: ");
        nameFile = sc.nextLine();
        String path = Constants.BASE_PATH_IN + nameFile;
        frs.getOutput(frs.handleFile(path));
    }
}
