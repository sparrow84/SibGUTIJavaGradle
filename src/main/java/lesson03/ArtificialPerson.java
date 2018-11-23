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
     * @param surname
     * @param phoneNumber
     * @param eMail
     * @param fullNameOfArtificialPerson
     * @param abbreviatedNameOfArtificialPerson
     */
    public ArtificialPerson (int id, String name, String surname, String phoneNumber, String eMail, String fullNameOfArtificialPerson, String abbreviatedNameOfArtificialPerson) {
        super(id, name, surname, phoneNumber, eMail);
        this.fullNameOfArtificialPerson = fullNameOfArtificialPerson;
        this.abbreviatedNameOfArtificialPerson = abbreviatedNameOfArtificialPerson;
    }

    public Field[] getFields () {
        return MyUtils.concatenate(this.getClass().getSuperclass().getDeclaredFields(),this.getClass().getDeclaredFields());
    }

    public boolean approximateCompare (String[] searchParams) {
        boolean res = true;
        String[] params = { name,  surname,  phoneNumber,  eMail,  fullNameOfArtificialPerson,  abbreviatedNameOfArtificialPerson};
        if (searchParams != null && searchParams.length == params.length) {
            for (int i = 0; i < params.length; i++) {
                if (!"".equals(searchParams[i]) && !searchParams[i].trim().equalsIgnoreCase(params[i])) {
                    res = false;
                    break;
                }
            }
        }
        return res;
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
        return
                "\nid = " + id +
                        "\nname = " + name +
                        "\nsurname = " + surname +
                        "\nphoneNumber = " + phoneNumber +
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
