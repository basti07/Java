
package k6;
import java.time.LocalDate;

public class Time {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d.lengthOfYear());
	}

}
