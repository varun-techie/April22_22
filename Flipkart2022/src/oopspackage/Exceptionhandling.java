package oopspackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionhandling {

	public static void main(String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
//throws used to declare an exception,come along with method signature
		
		//throw--exception--explict exception,msg derive
		
		if(19>17) {
			
			
			throw new ArithmeticException("my own method");
		}
		
		
		try {
			FileInputStream Fis;
			Fis= new FileInputStream("");
			System.out.println("one");
			System.out.println("two");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}//compile time
		
		
		System.out.println("test here");
		
		
		
		//unchecked exception --run time
		//int i=10/0;
		
		
		int[] a= {1,2,3};
		System.out.println(a[10]);
		
		
	}

}
