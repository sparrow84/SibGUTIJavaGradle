package lesson03;

import java.io.File;
import java.io.IOException;

public class PBFileHandler {
    
//    private String filePath;
    
    File storage;
    
    public PBFileHandler(String filePath) {
        storage = new File(filePath);

        try {
            if (storage.createNewFile())
                System.out.println("File " + filePath + " created sucsessful");
            else
                System.out.println("File " + filePath + " already exists");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() {}

    public boolean isExist () {
        return storage.exists();
    }

}
