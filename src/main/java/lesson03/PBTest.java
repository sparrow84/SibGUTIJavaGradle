package lesson03;

import java.util.Arrays;

public class PBTest {
    public static void main(String ...args) {

//        Test01();
        Test02();
    }

    public static void Test01 () {

        String[] arr1 = new String[]{"1","2","3"};
        String[] arr2 = new String[]{"4","5","6"};

        ArtificialPerson ap = new ArtificialPerson();

        System.out.println("getFields - " + ap.getClass().getFields().length);

        System.out.println("getDeclaredFields - " + ap.getClass().getDeclaredFields().length);

        System.out.println("getCountFields - " + ap.getFields().length);

    }

    public static void Test02 () {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addArtificialPerson(
                "Jon",
                "",
                "Smith",
                "+7-999-888-4545",
                "1984.08.12",
                "Moonland",
                "Olymp",
                "Westmoon",
                "LuntickStreet",
                "25",
                "darkmoon@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );

//        System.out.println(phoneBook.);
    }
}
