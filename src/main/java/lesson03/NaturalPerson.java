package lesson03;

import java.lang.reflect.Field;

public class NaturalPerson extends User {

    private String profession;


    public NaturalPerson(int id, String name, String surname, String phoneNumber, String eMail, String profession) {
        super(id, name, surname, phoneNumber, eMail);
        this.profession = profession;
    }

    public static String[] getNameFields () {
        Field[] fields = MyUtils.concatenate(ArtificialPerson.class.getSuperclass().getDeclaredFields(),ArtificialPerson.class.getDeclaredFields());
        String[] names = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            names[i] = fields[i].getName();
        }
        return names;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
