import java.util.Scanner;

public class mian {

	public static void main(String[] avgs) {

		Scanner input = new Scanner(System.in);

		String a, b, c, t = "";

		a = input.next();
		b = input.next();
		c = input.next();

		if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")) {

			t = "aguia";
		}
		if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {

			t = "pomba";
		}
		if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {

			t = "homem";
		}
		if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")) {

			t = "vaca";
		}

		if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")) {

			t = "pulga";
		}
		if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")) {

			t = "lagarta";
		}
		if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")) {

			t = "sanguessuga";
		}
		if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("herbivoro")) {

			t = "minhoca";
		}

		System.out.println(t);

	}

}
