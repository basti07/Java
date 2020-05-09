package k6;

public class Girokonto extends Konto{
	double limit;
	
	Girokonto (String kn, double ks, double lim) {
		super(kn, ks);
		limit = lim;
	}
	
	double getLimit() {
		return limit;
	}
	
	void setLimit(double lim) {
		limit = lim;
	}
	
	void auszahlen(double awert) {
		if ((getKontostand() - awert) >= limit * (-1)) {
			super.auszahlen(awert);
		}else {
			System.out.println("Ihr Konto ist im Minubereich!");
		}
	}
		
	
}
