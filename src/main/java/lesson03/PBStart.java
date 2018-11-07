package lesson03;

public class PBStart {
    public static void main(String ...args) {
        ArtificialPerson ap = new ArtificialPerson();

        System.out.println(ap.getClass().getFields().length);

        System.out.println(ap.getClass().getDeclaredFields().length);

        System.out.println(ArtificialPerson.getCountFields());
    }
}
