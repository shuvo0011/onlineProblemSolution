import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		DecimalFormat  f=new DecimalFormat("0");
		DecimalFormat  d2=new DecimalFormat("0.00");
		
		float s = input.nextFloat();
		float r,a;
		
		
		
		if(s>0 && s<=400) {
			r = (float) 0.15;
			a = s*r;
			System.out.println("Novo salario: "+d2.format((s+a)));
			System.out.println("Reahjuste gahe: "+d2.format(a));
			System.out.println("Em percentual: "+(r*100)+"%");
			
		}
		else if(s>400 && s<=800) {
			r = (float) 0.12;
			a = s*r;
			System.out.println("Novo salario: "+d2.format((s+a)));
			System.out.println("Reahjuste gahe: "+d2.format(a));
			System.out.println("Em percentual: "+f.format((r*100))+"%");
			
		}
		else if(s>800 && s<=1200) {
			r = (float) 0.10;
			a = s*r;
			System.out.println("Novo salario: "+d2.format((s+a)));
			System.out.println("Reahjuste gahe: "+d2.format(a));
			System.out.println("Em percentual: "+f.format((r*100))+"%");
			
		}
		else if(s>1200 && s<=2000) {
			r = (float) 0.07;
			a = s*r;
			System.out.println("Novo salario: "+d2.format((s+a)));
			System.out.println("Reahjuste gahe: "+d2.format(a));
			System.out.println("Em percentual:" + f.format((r*100))+" %");
			
		}
		else{
			r = (float) 0.04;
			a = s*r;
			System.out.println("Novo salario: "+d2.format((s+a)));
			System.out.println("Reahjuste gahe: "+d2.format(a));
			System.out.println("Em percentual: "+f.format((r*100))+" %");
			
		}
		
	}

}
