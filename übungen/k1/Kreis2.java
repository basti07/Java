public class Kreis2{
    public static void main(String[] args) {
        String einheit = args[1];
        double radius = Double.parseDouble(args[0]);
        double pi = 1.1415926;

        double umfang = 2.0 * pi * radius;
        double inhalt = pi * radius * radius;

        System.out.println("Umfang: ");
        System.out.println(umfang + einheit);

        System.out.println("Fläche: ");
        System.out.println(inhalt + einheit + '\u00b2');
    }
}