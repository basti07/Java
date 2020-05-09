
/*Java-Programm mit if-Anweisung
*/

import javax.swing.JOptionPane;

public class Sektion1 {
    public static void main(String[] args) {
        int alter;
        String eingabe;
        eingabe = JOptionPane.showInputDialog("Geben sie ihr Alter ein:");
        alter = Integer.parseInt(eingabe);
        if (alter < 18) {
            JOptionPane.showMessageDialog(null, "Leider nicht volljährig!");
        } else {
            JOptionPane.showMessageDialog(null, "Glückwunsch sie sind volljährig!");
        }
    }
}