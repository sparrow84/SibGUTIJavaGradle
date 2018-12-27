package lesson03;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.Arrays;
import java.util.List;

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
//            else
//                System.out.println("File " + csvFile + " already exists");
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

    public void removeRecord(int id) { //FIXME

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader(csvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String[]> allRows = null;
        try {
            allRows = csvReader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

        createNewCSV();

        for(String[] row : allRows){
            if(!row[0].equals(Integer.toString(id)))
                addRecord(arrToString(row));
        }
    }

    public static void editRecord() {
        //TODO
    }

    public static String arrToString(String[] arr) {

        //FIXME
        // write cheks

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            sb.append("," + arr[i]);
        }

        return sb.toString();
    }


}
