package lesson03;

import java.lang.reflect.Field;

public class ArtificialPerson extends User {

    private String fullNameOfArtificialPerson;
    private String abbreviatedNameOfArtificialPerson;

    public ArtificialPerson (int id) {
        super(id);
    }

//    public ArtificialPerson (String[] classFields) {
//        super();
//
//        this.name = classFields[0];
//        this.patronymic = classFields[1];
//        this.surname = classFields[2];
//        this.phoneNumber = classFields[3];
//        this.birthday = classFields[4];
//        this.country = classFields[5];
//        this.city = classFields[6];
//        this.district = classFields[7];
//        this.street = classFields[8];
//        this.room = classFields[9];
//        this.eMail = classFields[10];
//        this.fullNameOfArtificialPerson = classFields[11];
//        this.abbreviatedNameOfArtificialPerson = classFields[12];
//    }

    /**
     * Constructor
     * @param name
     * @param patronymic
     * @param surname
     * @param phoneNumber
     * @param birthday
     * @param country
     * @param city
     * @param district
     * @param street
     * @param room
     * @param eMail
     * @param fullNameOfArtificialPerson
     * @param abbreviatedNameOfArtificialPerson
     */
    public ArtificialPerson (int id, String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {
        super(id, name, patronymic, surname, phoneNumber, birthday, country, city, district, street, room, eMail);
        this.fullNameOfArtificialPerson = fullNameOfArtificialPerson;
        this.abbreviatedNameOfArtificialPerson = abbreviatedNameOfArtificialPerson;
    }

    public Field[] getFields () {
        return MyUtils.concatenate(this.getClass().getSuperclass().getDeclaredFields(),this.getClass().getDeclaredFields());
    }

    public String getFullNameOfArtificialPerson() {
        return fullNameOfArtificialPerson;
    }

    public void setFullNameOfArtificialPerson(String fullNameOfArtificialPerson) {
        this.fullNameOfArtificialPerson = fullNameOfArtificialPerson;
    }

    public String getAbbreviatedNameOfArtificialPerson() {
        return abbreviatedNameOfArtificialPerson;
    }

    public void setAbbreviatedNameOfArtificialPerson(String abbreviatedNameOfArtificialPerson) {
        this.abbreviatedNameOfArtificialPerson = abbreviatedNameOfArtificialPerson;
    }



    @Override
    public String toString() {
        return "name = " + name +
        "\npatronymic = " + patronymic +
        "\nsurname = " + surname +
        "\nphoneNumber = " + phoneNumber +
        "\nbirthday = " + birthday +
        "\ncountry = " + country +
        "\ncity = " + city +
        "\ndistrict = " + district +
        "\nstreet = " + street +
        "\nroom = " + room +
        "\neMail = " + eMail +
        "\nfullNameOfArtificialPerson = " + fullNameOfArtificialPerson +
        "\nabbreviatedNameOfArtificialPerson = " + abbreviatedNameOfArtificialPerson;
    }


    public String toString2() {
        StringBuffer sb = new StringBuffer();
        Field[] fields = this.getFields();

        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i].getName() + " = zzz" + "\n"); //FIXME
        }
        return sb.toString();
    }

}
