package lesson03;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    List<Boolean> idList;

    private List<ArtificialPerson> artificialPersons;
    private List<NaturalPerson>    naturalPersons;

    PhoneBook () {
        idList = new ArrayList<>();
        artificialPersons = new ArrayList<>();
        naturalPersons = new ArrayList<>();
    }

    public void addArtificialPerson (String name, String surname, String phoneNumber, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {

        artificialPersons.add(new ArtificialPerson(setIdAP(), name,  surname, phoneNumber, eMail, fullNameOfArtificialPerson, abbreviatedNameOfArtificialPerson));
        //TODO
        // write new person to csv file
    }

    public List getArtificialPersons () {
        return artificialPersons;
    }

    public ArtificialPerson findArtificialPersonById (int id) {

        ArtificialPerson res = null;

        for (int i = 0; i < artificialPersons.size(); i++) {
            if (artificialPersons.get(i).id == id) {
                res = artificialPersons.get(i);
            }
        }

        return res;
    }

    public void delArtificialPerson (int id) {

        //TODO
        // delete new person from csv file
    }

    public void delArtificialPerson (String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {

        //TODO
        // delete new person from csv file
    }

    public void changeArtificialPerson () {
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
