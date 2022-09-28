
public class main {

	public static void main(String[] args) {
		
		double s=0, m, i, b=1;

		
		for(i=1;i<=39;i=i+2) {
			s+= (i/b);
			b=b*2;
		}
		
		System.out.println(s);
		
	}

}
