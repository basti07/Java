package k6;

public class Kontotest {

	public static void main(String[] args) {
		Konto k = new Konto("00000000000001", 1000);
		System.out.println("Kontonummer: " + k.getKontonummer());
		System.out.println("Kontostand: " + k.getKontostand() + "€");
		k.einzahlen(500);
		k.auszahlen(750.50);
		System.out.println("Kontonummer: " + k.getKontonummer());
		System.out.println("Kontostand: " + k.getKontostand() + "€");

	}

}
