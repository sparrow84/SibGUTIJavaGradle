package lesson03;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PBFileHandler {

    String name = "../MyPhoneBook.csv";
    private String csvFile = name;
    File storage;

    CSVWriter writer;
//    String csvFile;


    public PBFileHandler(String csvFile) {

        this.csvFile = csvFile;
        storage = new File(csvFile);

        try {
            if (storage.createNewFile())
                System.out.println("File " + csvFile + " created sucsessful");
            else
                System.out.println("File " + csvFile + " already exists");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PBFileHandler() {

//        this.csvFile = csvFile;
        storage = new File(csvFile);

        try {
            if (storage.createNewFile())
                System.out.println("File " + csvFile + " created sucsessful");
            else
                System.out.println("File " + csvFile + " already exists");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isExist () {
        return storage.exists();
    }

    public void createNewCSV() {
        try {
            writer = new CSVWriter(new FileWriter(csvFile));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(this.getClass().getName() + "   " + "createNewCSV");
        }
    }

    public void addRecord(String newRecord) {
        try {
            writer = new CSVWriter(new FileWriter(csvFile, true));
            String [] record = newRecord.split(",");
            writer.writeNext(record);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void removeRecord() {

    }




}
