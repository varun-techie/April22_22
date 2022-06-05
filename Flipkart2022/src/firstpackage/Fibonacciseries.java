package firstpackage;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=5;i++) {
			
			int op = a+b;
			System.out.println(op);
			a=b;
			b=op;
			
			
		}
		
		
	}

}
