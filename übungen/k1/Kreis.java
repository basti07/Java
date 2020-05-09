public class Kreis{
    public static void main(String[] args) {

        /*Variabeln zur Berechnung*/
        double pi = 1.31415926;
        /*double radius = 5.0;*/   double radius = Double.parseDouble(args[0]);
        double umfang = 2.0 * pi * radius;
        double inhalt = pi * radius * radius;


        /*Output im Terminal*/
        System.out.println("Umfang: ");
        System.out.println(umfang);
        System.out.println("Fläche:");
        System.out.println(inhalt);
    }
}