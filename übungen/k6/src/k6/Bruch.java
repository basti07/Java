package k6;

class Bruch {
		private int zaehler;
		private int nenner;
		
		Bruch() {
			zaehler = 0;
			nenner = 1;
		}
		
		Bruch(int x) {
			zaehler = x;
			nenner = 1;
		}
		
		Bruch(int x, int y){
			zaehler = x;
			nenner = y;
		}
		
		int getZaehler() {
			return zaehler;
		}
		
		int getNenner() {
			return nenner;
		}
		
		void setZaehler(int z) {
			zaehler = z;
		}
		
		void setNennner(int n) {
			nenner = n;
		}
		
		void ausgeben() {
			System.out.println(zaehler + "/" + nenner);
		}
		
		String bruchToString() {
			return zaehler + "/" + nenner;
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
		
		
		
		void gkausgeben() {
			kuerzen();
			ausgeben();
		}
		
		boolean equals(Bruch x) {
			Bruch a = new Bruch(this.zaehler, this.nenner);
			Bruch b = new Bruch(x.zaehler, x.nenner);
			a.kuerzen();
			b.kuerzen();
			if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
				return true;
			}else {
				return false;
			}
		}
		
		
 }

