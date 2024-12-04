import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		float n1,n2,n3,n4,avg,n5,rc;
		
		n1 = input.nextFloat();
		n2 = input.nextFloat();
		n3 = input.nextFloat();
		n4 = input.nextFloat();
		
		avg = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		
		System.out.printf("Medio: %.1f \n",avg);
		
		if(avg>=7.0) {
			System.out.printf("Aluno aprovada.\n");
		}
		else if(avg<5.0) {
			
			System.out.printf("Aluno reprovada.\n");
				
		}
		else if(avg>5.0 && avg<6.9) {
			System.out.printf("Aluno em exame.\n");
			n5 = input.nextFloat();
			System.out.printf("Nota do exame: %.1f \n",n5);
			rc = (avg+n5)/2;
			if (rc >= 5.0){
				  System.out.print("Aluno aprovado.\n");
				}
			else {
				    System.out.print("Aluno reprovado.\n");			    
				  }		   
			System.out.printf("Media final: %.1f \n",rc);
		}
		
		
		
	}

}
