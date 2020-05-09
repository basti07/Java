import javax.swing.JOptionPane;

public class ZahlenTest {
    public static void main(String[] args) {
        String eingabe;
        double zahl;
        boolean istNegativ;

        eingabe = JOptionPane.showInputDialog("Geben sie eine Zahl ein!");
        zahl = Double.parseDouble(eingabe);

        if (zahl < 0) {
            istNegativ = true;
        } else {
            istNegativ = false;
        }
        if (istNegativ = true) {
            JOptionPane.showMessageDialog(null, zahl + " ist negativ!");
        } else {
            JOptionPane.showMessageDialog(null, zahl + " ist nicht negativ!");
        }
    }
}