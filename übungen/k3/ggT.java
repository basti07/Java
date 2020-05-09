import javax.swing.JOptionPane;

public class ggT {
    public static void main(String[] args) {

        int m, n, r;
        String eingabe;
        eingabe = JOptionPane.showInputDialog("Geben sie eine Zahl für m ein: ");
        m = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben sie eine Zahl für n ein: ");
        n = Integer.parseInt(eingabe);

        r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        JOptionPane.showMessageDialog(null, "Der ggT ist " + n);

    }
}