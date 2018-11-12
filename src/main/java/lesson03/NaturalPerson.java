package lesson03;

public class NaturalPerson extends User {

    private String profession;


    public NaturalPerson(int id, String name, String patronymic, String surname, String phoneNumber, String birthday, String country, String city, String district, String street, String room, String eMail, String profession) {
        super(id, name, surname, phoneNumber, eMail);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
