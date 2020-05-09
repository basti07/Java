//Einheitsabfrage gleich hier rein machen!!!
package k5;
import javax.swing.JOptionPane;


public class Kreis {
	double radius;
	double einheit;
	
		Kreis(){
			einheit = 0;
			radius = 0;
		}
		
		Kreis(double r, double keinheit){
			radius = r;
			einheit = keinheit;
		}

		double getRadius() {
			return radius;
		}
		
		void setRadius(double r) {
			radius = r;
		}
		
		double getUmfang() {
			return 2 * 3.14 * radius;
		}
		
		double getFlaeche() {
			return 3.14 * radius * radius;
		}
		
		double pi() {
			return 3.14;
		}
		
		double kreiseinheit() {
			return einheit;
		}
		
		void ausgabe() {
			
			System.out.println("Pi beträgt " + this.pi());
			System.out.println("Der Kreisradius beträgt " + this.getRadius());
			System.out.println("Der Umfang beträgt " + this.getUmfang());
			System.out.println("Die Fläche beträgt " + this.getFlaeche());
		}
}

