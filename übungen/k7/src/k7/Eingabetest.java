package k7;

import javax.swing.JOptionPane;
import java.time.Duration;
import java.time.Instant;
public class Eingabetest {

	public static void main(String[] args) {
		String eingabe;
		Instant start = Instant.now();
		eingabe = JOptionPane.showInputDialog("Geben sie 'Fischers Fritz fischt frische Fische' ein:");
		Instant ende = Instant.now();
		Duration zeit = Duration.between(start, ende);
		System.out.println(zeit.getSeconds() + " und " + zeit.toMillis());
	}

}
