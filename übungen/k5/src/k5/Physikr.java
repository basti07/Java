package k5;
import javax.swing.JOptionPane;

public class Physikr {
	
	
	void physik() {
		double v;
		double s;
		double t;
		String eingabe;
		char vst;
		/*v = s/t;
		s = v*t;
		t = s/v;*/
		
		eingabe = JOptionPane.showInputDialog("Möchtest du die Geschwindigkeit, die Strecke oder die Zeit ausrechen (v/s/t)?");
		vst = eingabe.charAt(0);
		if (vst == 'v') {
			eingabe = JOptionPane.showInputDialog("Gebe einen Wert für s in km an.");
			s = Double.parseDouble(eingabe);
			eingabe = JOptionPane.showInputDialog("Gebe einen Wert für t in Stunden an.");
			t = Double.parseDouble(eingabe);
			
			v = s/t;
			JOptionPane.showMessageDialog(null, "Die Geschwindigkeit beträgt " + v + " km/h.");
		}else {
			if (vst == 's') {
				eingabe = JOptionPane.showInputDialog("Gebe einen Wert für v in km/h an.");
				v = Double.parseDouble(eingabe);
				eingabe = JOptionPane.showInputDialog("Gebe einen Wert für t in Stunden an.");
				t = Double.parseDouble(eingabe);
				
				s = v*t;
				JOptionPane.showMessageDialog(null, "Die Geschwindigkeit beträgt " + s + " km/h.");
			}else {
				eingabe = JOptionPane.showInputDialog("Gebe einen Wert für v in km/h an.");
				v = Double.parseDouble(eingabe);
				eingabe = JOptionPane.showInputDialog("Gebe einen Wert für s in km an.");
				s = Double.parseDouble(eingabe);
				
				t = s/v;
				JOptionPane.showMessageDialog(null, "Die Geschwindigkeit beträgt " + t + " km/h.");
			}
		}
		
		
		
		
				
		
	}

}
