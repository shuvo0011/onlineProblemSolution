class student{
		
		int roll=0,mark=100;
		void show() {
			System.out.println(roll+" "+mark);
		}
	}

class shuvo extends student
	{

		int a=2;
		void show(){
			System.out.println("hello");
		}
	}


public class main {
	
	public static void main(String[] args) {
		
		shuvo r = new shuvo();
		r.show();

	}
	
	
	

}
