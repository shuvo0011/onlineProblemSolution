import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	public static void main(String[] avgs) {

		Scanner input = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");

		float a = input.nextFloat();
		a = Float.valueOf(f.format(a));
		String d = "";
		float n=0;;

		if (a <= 2000) {
			d = "Isento";
		} else if (a <= 3000) {
			n = (float) ((a-2000) * 0.08);
		} else if (a <= 4500) {
			n = (float) ((a-3000)*0.18+1000.00*0.08);
		} else {
			n = (float) ((a - 4500.00)*0.28 + 1500.00*0.18 + 1000.00*0.08);
		}

		System.out.println("R$ " + n);

	}

}
