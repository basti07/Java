
package k5;

public class Bruch {
    int zaehler;
    int nenner;
    
    void ausgabe() {
	System.out.print(zaehler + "/" + nenner);
    }
    
    void kuerzen() {
	int m, n, r;
	m = Math.abs(zaehler);
	n = Math.abs(nenner);
	r = m % n;
	while (r > 0) {
	    m = n;
	    n = r; 
	    r = m % n;
	}
	zaehler /= n;
	nenner /= n;
    }
    
    
     

}
