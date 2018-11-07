package lesson03;

public class ArtificialPerson extends User {
    private String fullNameOfArtificialPerson;
    private String abbreviatedNameOfArtificialPerson;


    public ArtificialPerson () {
        super();
    }

    public ArtificialPerson (String[] classFields) {
        super();

        this.name = classFields[0];
        this.patronymic = classFields[1];
        this.surname = classFields[2];
        this.phoneNumber = classFields[3];
        this.birthday = classFields[4];
        this.country = classFields[5];
        this.city = classFields[6];
        this.district = classFields[7];
        this.street = classFields[8];
        this.room = classFields[9];
        this.eMail = classFields[10];
        this.fullNameOfArtificialPerson = classFields[11];
        this.abbreviatedNameOfArtificialPerson = classFields[12];

    }

    public ArtificialPerson (String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {
        super(name, patronymic, surname, phoneNumber, birthday, country, city, district, street, room, eMail);
        this.fullNameOfArtificialPerson = fullNameOfArtificialPerson;
        this.abbreviatedNameOfArtificialPerson = abbreviatedNameOfArtificialPerson;
    }


    public static int getCountFields () {
        return ArtificialPerson.class.getDeclaredFields().length + User.getCountFields();
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

}
