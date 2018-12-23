package lesson03;

import java.lang.reflect.Field;

public class ArtificialPerson extends User {

    private String fullNameOfArtificialPerson;
    private String abbreviatedNameOfArtificialPerson;

    public ArtificialPerson (int id) {
        super(id);
    }

    /**
     * Constructor
     * @param name
     * @param surname
     * @param phoneNumber
     * @param eMail
     * @param fullNameOfArtificialPerson
     * @param abbreviatedNameOfArtificialPerson
     */
    public ArtificialPerson (
            int id,
            String name,
            String surname,
            String phoneNumber,
            String eMail,
            String fullNameOfArtificialPerson,
            String abbreviatedNameOfArtificialPerson) {
        super(id, name, surname, phoneNumber, eMail);
        this.fullNameOfArtificialPerson = fullNameOfArtificialPerson;
        this.abbreviatedNameOfArtificialPerson = abbreviatedNameOfArtificialPerson;
    }




    public static String[] getNameFields () {
        Field[] fields = MyUtils.concatenate(ArtificialPerson.class.getSuperclass().getDeclaredFields(),ArtificialPerson.class.getDeclaredFields());
        String[] names = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            names[i] = fields[i].getName();
        }
        return names;
//        return MyUtils.concatenate(this.getClass().getSuperclass().getDeclaredFields(),this.getClass().getDeclaredFields());
    }

    public boolean approximateCompare (String[] searchParams) {
        boolean res = true;
        String[] params = { name,  surname,  phoneNumber,  eMail,  fullNameOfArtificialPerson,  abbreviatedNameOfArtificialPerson};
        if (searchParams != null) {
            if (searchParams.length == params.length) {
                for (int i = 0; i < params.length; i++) {
                    if (!"".equals(searchParams[i]) && !searchParams[i].trim().equalsIgnoreCase(params[i])) {
                        res = false;
                        break;
                    }
                }
            } else System.err.println(this.getClass().getName() + ".approximateCompare: searchParams wrong length (" + searchParams.length + "). Must be " + params.length);
        } else System.err.println(this.getClass().getName() + ".approximateCompare: searchParams = null");
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
        return "\nid = " + id +
               "\nname = " + name +
               "\nsurname = " + surname +
               "\nphoneNumber = " + phoneNumber +
               "\neMail = " + eMail +
               "\nfullNameOfArtificialPerson = " + fullNameOfArtificialPerson +
               "\nabbreviatedNameOfArtificialPerson = " + abbreviatedNameOfArtificialPerson;
    }

    public String[] getArrayParams() {
        return new String[]{Integer.toString(id),name,surname,phoneNumber,eMail,fullNameOfArtificialPerson,abbreviatedNameOfArtificialPerson};
    }


    public String toString2() {
        StringBuffer sb = new StringBuffer();
        String[] fields = this.getNameFields();

        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i] + " = zzz" + "\n"); //FIXME
        }
        return sb.toString();
    }

    @Override
    public String getCSVString() {
//        return Integer.toString(id) + "," + name + "," + surname + "," + phoneNumber + "," + eMail + "," + fullNameOfArtificialPerson + "," + abbreviatedNameOfArtificialPerson;
        return Integer.toString(id) + name + surname + phoneNumber + eMail + fullNameOfArtificialPerson + abbreviatedNameOfArtificialPerson;
    }
}
