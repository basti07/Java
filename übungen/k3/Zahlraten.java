import javax.swing.JOptionPane;

public class Zahlraten {
    public static void main(String[] args) {
        String eingabe;
        int zahl = 6;
        int eigabezahl = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl zwischen 0 und 10 ein:"));
        switch (eigabezahl) {
        case 6:
            JOptionPane.showMessageDialog(null, "Richtig!");
            break;
        case 4:
        case 5:
        case 7:
        case 8:
            JOptionPane.showMessageDialog(null, "Knapp daneben!");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Falsch!");
            break;
        }
    }
}