package lesson03;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class PhoneBook {

    List<Boolean> idList;

    private List<ArtificialPerson> artificialPersons;
    private List<NaturalPerson>    naturalPersons;

    StringBuilder sb = new StringBuilder();
    Formatter f = new Formatter();

    PhoneBook () {
        idList = new ArrayList<>();
        artificialPersons = new ArrayList<>();
        naturalPersons = new ArrayList<>();
    }

    public List getArtificialPersons () {
        return artificialPersons;
    }

    public void addArtificialPerson (String name, String surname, String phoneNumber, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {

        artificialPersons.add(new ArtificialPerson(setIdAP(), name,  surname, phoneNumber, eMail, fullNameOfArtificialPerson, abbreviatedNameOfArtificialPerson));
        //TODO
        // write new person to csv file


    }

    public ArtificialPerson getArtificialPersonById(int id) {
        ArtificialPerson res = null;
        for (int i = 0; i < artificialPersons.size(); i++) {
            if (artificialPersons.get(i).id == id) {
                res = artificialPersons.get(i);
            }
        }
        return res;
    }

    public void delArtificialPersonById (int id) {
        for (int i = 0; i < artificialPersons.size(); i++) {
            if (artificialPersons.get(i).id == id) {
                artificialPersons.remove(id);
            }
        }

        //TODO
        // delete new person from csv file
    }

    public List<ArtificialPerson> searchArtificialPerson (String name, String surname, String phoneNumber, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {

        List<ArtificialPerson> res = new ArrayList<>();

        String[] params = { name,  surname,  phoneNumber,  eMail,  fullNameOfArtificialPerson,  abbreviatedNameOfArtificialPerson};


        for (int i = 0; i < artificialPersons.size(); i++) {

            if (artificialPersons.get(i).approximateCompare(params)) {
                res.add(artificialPersons.get(i));
            }
        }
        return res;
    }

    public void changeArtificialPerson () {
        //TODO
    }


    public void showTableFixedColumnsWidth(ArtificialOrNatural aon, int start, int count) {

        String[] nameFields;
        List<User> users;

        if (aon.equals(ArtificialOrNatural.AP)) {
            nameFields = ArtificialPerson.getNameFields();
            users = new ArrayList<>(artificialPersons);
        } else {
            nameFields = NaturalPerson.getNameFields();
            users = new ArrayList<>(naturalPersons);
        }

        String startChars = "|";
//        System.out.printf(startChars);

//        StringBuilder sb = new StringBuilder();
//        Formatter f = new Formatter();

        f = new Formatter();

        if (sb.length() > 0) {
            sb.delete(0, sb.length() - 1);
        }
//        sb.append(startChars);
        f.format(startChars);
        int fill;

        for (int i = 0; i < nameFields.length; i++) {
            fill = nameFields[i].length() + 1;
            f.format(" %-" + fill + "s |", nameFields[i]);
//            f = new Formatter();
//            sb.append(f.format(" %-" + fill + "s |", nameFields[i]));
//            System.out.printf("%-" + fill + "s | ", nameFields[i]);
        }
//        System.out.println(sb.toString());
        System.out.println(f);
        for (int i = 0; i < sb.length(); i++) System.out.print("-");

        if (start > -1 && start < users.size()) {

            //

        }


        //TODO
    }


    private int setIdAP() {
        int res = -1;
        if (idList.isEmpty()) {
            idList.add(true);
            res = 0;
        } else {
            for (int i = 0; i < idList.size(); i++) {
                if (!idList.get(i)) {
                    res = i;
                    idList.set(i,true);
                }
            }
            if (res == -1) {
                idList.add(true);
                res = idList.size() - 1;
            }
        }
        return res;
    }

    protected void freeId(int id) {
        idList.set(id, false);
    }


}

/*

+ add

+ get by id

change

+ search

+ del by id


showTableFixedColumnsWidth


*/