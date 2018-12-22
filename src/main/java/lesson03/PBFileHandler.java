package lesson03;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PBFileHandler {

    CSVWriter writer;
    String csvFile;

    public PBFileHandler() {
        // create new file
        // ...
    }

    public void createNewCSV() {
        try {
            writer = new CSVWriter(new FileWriter(csvFile));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(this.getClass().getName() + "   " + "createNewCSV");
        }
    }

    public void addRecord(String recordS) {
        try {
            writer = new CSVWriter(new FileWriter(csvFile, true));
            String [] record = recordS.split(",");
            writer.writeNext(record);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    private String filePath;
//    CSVReader
//
//    File storage;
//
//    public PBFileHandler(String filePath) {
//        storage = new File(filePath);
//
//        try {
//            if (storage.createNewFile())
//                System.out.println("File " + filePath + " created sucsessful");
//            else
//                System.out.println("File " + filePath + " already exists");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void write() {}
//
//    public boolean isExist () {
//        return storage.exists();
//    }

}
