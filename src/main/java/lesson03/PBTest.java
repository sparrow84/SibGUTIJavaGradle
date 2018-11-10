package lesson03;

public class PBTest {
    public static void main(String ...args) {

        Test01();

    }

    public static void Test01 () {
        ArtificialPerson ap = new ArtificialPerson();

        System.out.println("getFields - " + ap.getClass().getFields().length);

        System.out.println("getDeclaredFields - " + ap.getClass().getDeclaredFields().length);

        System.out.println("getCountFields - " + ap.getFields().length);


        String s = "qwe";

        System.out.println("".equals(s));

        System.out.println(ap);

    }
}
