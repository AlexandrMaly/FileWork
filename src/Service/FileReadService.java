package Service;

import java.io.FileReader;
import java.io.IOException;

public class FileReadService {
    public String handleFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
