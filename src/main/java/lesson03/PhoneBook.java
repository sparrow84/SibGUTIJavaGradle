package lesson03;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<ArtificialPerson> artificialPersons = new ArrayList<>();
    private List<NaturalPerson>    naturalPersons    = new ArrayList<>();

    PhoneBook () {
        artificialPersons = new ArrayList<>();
        naturalPersons = new ArrayList<>();
    }

    public void addArtificialPerson (String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {

        artificialPersons.add(new ArtificialPerson(setIdAP(), name, patronymic, surname, phoneNumber, birthday, country, city, district, street, room, eMail, fullNameOfArtificialPerson, abbreviatedNameOfArtificialPerson));
        //TODO
        // write new person to csv file
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

    public void findeArtificialPerson (String[] fieldsAP) {
        //TODO

        for (int i = 0; i < fieldsAP.length; i++) {
            if (!"".equals(fieldsAP[i])) {
                for (int j = 0; j < artificialPersons.size(); j++) {

                }
            }
        }

    }

/* FIXME
    private int setIdAP() {
        int res = -1;
        if (artificialPersons.isEmpty()) {

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

    protected static void freeId(int id) {
        idList.set(id, false);
    }
*/

}
