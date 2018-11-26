package lesson03;

public abstract class User {

    protected int id;

    static protected String[] nameParams = {"name", "surname", "phoneNumber", "eMail"};
    protected String[] params;

//    protected String name;
//    protected String surname;
//    protected String phoneNumber;
//    protected String eMail;

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String surname, String phoneNumber, String eMail) {
        this.id = id;
        params = new String[nameParams.length];
        params[0] = name;
        params[1] = surname;
        params[2] = phoneNumber;
        params[3] = eMail;
    }




//  --- Getters and setters ----------------------------------------------------------------

    public String getName() {
        return params[0];
    }

    public void setName(String name) {
        params[0] = name;
    }

    public String getSurname() {
        return params[1];
    }

    public void setSurname(String surname) {
        params[1] = surname;
    }

    public String getPhoneNumber() {
        return params[2];
    }

    public void setPhoneNumber(String phoneNumber) {
        params[2] = phoneNumber;
    }

    public String geteMail() {
        return params[3];
    }

    public void seteMail(String eMail) {
        params[3] = eMail;
    }

}
