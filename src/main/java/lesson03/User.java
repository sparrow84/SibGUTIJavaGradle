package lesson03;

public abstract class User {

//    protected static List<Boolean> idList;
    protected int id;
    protected String name;
    protected String surname;
    protected String phoneNumber;
    protected String eMail;

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String surname, String phoneNumber, String eMail) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }






//  --- Getters and setters ----------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

}
