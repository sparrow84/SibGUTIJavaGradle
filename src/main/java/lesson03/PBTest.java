package lesson03;

public class PBTest {
    public static void main(String ...args) {

//        Test01();
//        Test02();
        Test03();
    }

    public static void Test01 () {

        String[] arr1 = new String[]{"1","2","3"};
        String[] arr2 = new String[]{"4","5","6"};

        ArtificialPerson ap = new ArtificialPerson(0);

        System.out.println("getFields - " + ap.getClass().getFields().length);

        System.out.println("getDeclaredFields - " + ap.getClass().getDeclaredFields().length);

        System.out.println("getCountFields - " + ap.getNameFields().length);

    }

    public static void Test02 () {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addArtificialPerson(
                "Jon",
                "Smith",
                "+7-999-888-4541",
                "darkmoon@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );

        phoneBook.addArtificialPerson(
                "Pol",
                "Watson",
                "+7-999-888-4542",
                "watson@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );

        phoneBook.addArtificialPerson(
                "Lisa",
                "Owerlord",
                "+7-999-888-4543",
                "owerlord@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );

        phoneBook.addArtificialPerson(
                "April",
                "O'Neel",
                "+7-999-888-4544",
                "turtlepower@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );




        System.out.println(phoneBook.getArtificialPersonById(2));

        System.out.println("\n");

        for (ArtificialPerson ap : phoneBook.searchArtificialPerson("","","","","","")
             ) {
            System.out.println(ap.getName());
        }
    }


    public static void Test03 () {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addArtificialPerson(
                "Jon",
                "Smith",
                "+7-999-888-4541",
                "darkmoon@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );

        phoneBook.addArtificialPerson(
                "Pol",
                "Watson",
                "+7-999-888-4542",
                "watson@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );

        phoneBook.addArtificialPerson(
                "Lisa",
                "Owerlord",
                "+7-999-888-4543",
                "owerlord@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );

        phoneBook.addArtificialPerson(
                "April",
                "O'Neel",
                "+7-999-888-4544",
                "turtlepower@space.swag",
                "Public corporation \"moon industrial soft power\"",
                "PC \"MISP\""
        );


        phoneBook.showTableFixedColumnsWidth(ArtificialOrNatural.AP,0,0);

    }
}
