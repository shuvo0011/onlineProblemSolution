import java.util.Scanner;

public class main {
	
	public static void main(String[] avgs) {
		
		Scanner input= new Scanner(System.in);
		
		int i = input.nextInt();
		
		switch(i) {
		case 61:
			System.out.println("brasilia");
			break;
		case 71:
			System.out.println("salvador");
			break;
		case 11:
			System.out.println("paula");
			break;
		case 21:
			System.out.println("rio de janeiro");
			break;
		case 32:
			System.out.println("Juiz de fora");
			break;
		case 19:
			System.out.println("Camoanis");
			break;
		case 27:
			System.out.println("vitoria");
			break;
		case 31:
			System.out.println("belo horizonra");
			break;
		default:
			System.out.println("DDD not found");
			break;
		
		}
		
	}

}
