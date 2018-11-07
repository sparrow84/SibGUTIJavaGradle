package lesson03;

public class NaturalPerson extends User {

    private String profession;


    public NaturalPerson(String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String profession) {
        super(name, patronymic, surname, phoneNumber, birthday, country, city, district, street, room, eMail);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
