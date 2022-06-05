package oopspackage;

public class MarutiCar extends WholesaleCar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarutiCar mar= new MarutiCar();
		mar.engine();//cost heavy
		light();
		
		
	}
	
	
	//Java annotation--flow of the method decide
	//when a child class method overides the parent class method
	@Override
	public void engine() {
		
		System.out.println("1200cc, my own engine");
	}

	//method overloading(same method name but with different parameters)
	public void add(int a,double x,String e) {
		
		
	}
	
	
	
	public void add(String a,int b) {
		
	}
	
	
	
}
