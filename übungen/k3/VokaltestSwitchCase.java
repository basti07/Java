import javax.swing.JOptionPane;

public class VokaltestSwitchCase {
    public static void main(String[] args) {
        String eingabe;
        char c;
        eingabe = JOptionPane.showInputDialog("Geben sie einen Buchstaben ein :");
        c = eingabe.charAt(0);
        switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");
            break;
        default:
            JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
        }
    }
}