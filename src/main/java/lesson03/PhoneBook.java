package lesson03;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<ArtificialPerson> artificialPersons = new ArrayList<>();
    private List<NaturalPerson>    naturalPersons    = new ArrayList<>();

    // DELETE ^^^^^^^^^^^^^^

    void qwe(){
//        artificialPersons;
    }

    // ^^^^^^^^^^^^^^^^^^^^^

    /**
     * @param fieldsAP
     * fieldsAP[0] - name
     * fieldsAP[1] - patronymic
     * fieldsAP[2] - surname
     * fieldsAP[3] - phoneNumber
     * fieldsAP[4] - birthday
     * fieldsAP[5] - country
     * fieldsAP[6] - city
     * fieldsAP[7] - district
     * fieldsAP[8] - street
     * fieldsAP[9] - room
     * fieldsAP[10] - eMail
     * fieldsAP[11] - fullNameOfArtificialPerson
     * fieldsAP[12] - abbreviatedNameOfArtificialPerson
     * fieldsAP[] -
     * fieldsAP[] -
     * fieldsAP[] -
     * fieldsAP[] -
     * fieldsAP[] -
     */
    public void addArtificialPerson (String[] fieldsAP) {
        //                                         name,        patronymic,  surname,     phoneNumber, birthday,    country,     city,        district,    street,      room,        eMail,        fullNameAPer, abbreviatedNameAP
        artificialPersons.add(new ArtificialPerson(fieldsAP[0], fieldsAP[1], fieldsAP[2], fieldsAP[3], fieldsAP[4], fieldsAP[5], fieldsAP[6], fieldsAP[7], fieldsAP[8], fieldsAP[9], fieldsAP[10], fieldsAP[11], fieldsAP[12]));

    }

    public void addArtificialPerson (String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {
        artificialPersons.add(new ArtificialPerson(name, patronymic, surname, phoneNumber, birthday, country, city, district, street, room, eMail, fullNameOfArtificialPerson, abbreviatedNameOfArtificialPerson));
        //TODO
        // write new person to csv file
    }

    public void delArtificialPerson (String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {
        artificialPersons.add(new ArtificialPerson(name, patronymic, surname, phoneNumber, birthday, country, city, district, street, room, eMail, fullNameOfArtificialPerson, abbreviatedNameOfArtificialPerson));
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

    public int getCountFieldsAP() {
        return new ArtificialPerson().getClass().getFields().length;
    }




}
