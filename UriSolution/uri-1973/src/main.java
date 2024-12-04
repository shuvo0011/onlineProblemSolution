import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int n,i,c=1,sum=0;
		n=input.nextInt();
		
		int[] a=new int[n+1];
		
		for(i=1;i<=n;i++) {
			a[i]=input.nextInt();
		}
		
//		for(int j=1;j<=n;j++) {
//			System.out.print(a[j]+" ");
//		}
		
//		System.out.println();
//		System.out.println(c);
//		
		while(true) {
			if(c>=1 && c<=n) {
				if(a[c]==0) {
					c++;
					break;
				}
				else {
					if(a[c]%2==0) {
						a[c]--;
						c--;
					}else {
						a[c]--;
						c++;
					}
				}
			}else {
				break;
			}
			
//			for(int j=1;j<=n;j++) {
//				System.out.print(a[j]+"-"+c+" ");
//			}
			
			//System.out.println();
			
			//System.out.println();
		}
		
		
//		System.out.println("dfkj");
		
		for(int j=1;j<=n;j++) {
			sum = sum+a[j];
		}
		
		System.out.println(sum);
		

	}

}
