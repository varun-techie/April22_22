package oopspackage;

public class FordCar extends WholesaleCar {
	
	
	String color="blue";
	
	
	public FordCar() {
		super();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FordCar ford = new FordCar();
		System.out.println(ford.color);
		ford.engine();

		// static --classname
		light();
		model = "asdas";
		
		ford.callvariables();

	}

	public void callvariables() {
		System.out.println(color);
		System.out.println(super.color);
		super.engine();
		
	}

}
