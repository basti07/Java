import javax.swing.JOptionPane;

public class kreis3JOptionPane {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Gebe den Kriesradius ein: ");
        double radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geb eine Einheit an: ");
        String einheit = eingabe;
        double umfang = 2.0 * 3.1415926 * radius;
        double fleache = 3.1415926 * radius * radius;
        JOptionPane.showMessageDialog(null,
                "Umfang : " + umfang + einheit + "  " + "\nFläche: " + fleache + einheit + '\u00b2', "Ausgabe",
                JOptionPane.PLAIN_MESSAGE);
    }
}