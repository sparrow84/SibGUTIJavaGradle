package lesson03;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<ArtificialPerson> artificialPersons = new ArrayList<>();
    private List<NaturalPerson>    naturalPersons    = new ArrayList<>();


    public void addArtificialPerson (String[] fieldsAP) {
        //
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
    }

    public int getCountFieldsAP() {
        return new ArtificialPerson().getClass().getFields().length;
    }




}
