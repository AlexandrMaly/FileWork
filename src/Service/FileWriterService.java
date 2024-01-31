package Service;

import utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriterService {


    public void createFile(String nameFile, String contentText) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(Constants.BASE_PATH_IN + nameFile)) {
            byte[] bytes = contentText.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("your information added");
        } catch (IOException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}

