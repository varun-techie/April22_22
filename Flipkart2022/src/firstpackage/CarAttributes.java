package firstpackage;

public class CarAttributes {
	
	
	//object(variables and methods)
	String model;
	int noofwheels;
	
	String color;
	
	
	public CarAttributes() {
		
		System.out.println("am responsible");
	}
	
	//this--reference keyword--used to point local object(variable,methods)
	//this--constructor
	public CarAttributes(String model, int noofwheels, String color) {
		this(10);
		this.model=model;
		this.noofwheels=noofwheels;
		this.color=color;
		
		
	}
	
	public CarAttributes(int x) {
		
		System.out.println(x);
	}
	

}
