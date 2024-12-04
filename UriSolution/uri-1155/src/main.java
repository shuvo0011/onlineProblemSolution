
public class main {

	public static void main(String[] args) {
		
		
		double s = 0;
		double i,m;
		
		for(i=1;i<=100;i++) {
			
			m = (double) 1/i;
			s = s+m ;
			
			System.out.println(i);
			System.out.println(m);
			System.out.println(s);
		}
		
		System.out.print(s);

	}

}
