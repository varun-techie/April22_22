package firstpackage;

public class Arrayspgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//new
		String  arr[] = new String[3];//declare
		arr[0]="one";
		arr[1]="two";
		arr[2]="three";//initialize
		
		
		//shortest form
		String ars[]= {"one","two","three"};
		
		System.out.println(arr.length);
		//retreieve
		//general loop
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		
		//for each---retrieval--arrays and collections
		for (String s : arr) {
			System.out.println(s);
		}
		
		
		
		
		int[] a = new int[4];
		int[] b= {1,2,3,4,5};
		
		
		//Object--java superclass
		String s="something";
	Object[] ob = new Object[4];
	ob[0]=123;
	ob[1]="test";
	ob[2]=true;
	ob[3]=122.22;
	
	
	
	for(Object o:ob) {
		
		
	}
		
		
	
		
		
		
		
		
	}

}
