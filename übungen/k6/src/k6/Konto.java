package k6;

public class Konto {
	private String kontonummer;
	private double kontostand;
	
	Konto(String kn, double ks) {
		kontonummer = kn;
		kontostand =ks;
	}
	
	double getKontostand() {
		return kontostand;
	}
	
	String getKontonummer() {
		return kontonummer;
	}
	
	void einzahlen(double ewert) {
		kontostand = kontostand + ewert;
	}
	
	void auszahlen(double awert) {
		kontostand = kontostand - awert;
	}

}
