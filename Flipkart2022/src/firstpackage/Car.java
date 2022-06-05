package firstpackage;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CarAttributes ca = new CarAttributes();
		
		
		/*
		 * ca.model="ford"; ca.noofwheels=4; ca.color="blue";
		 */
		
		
		CarAttributes  carr= new CarAttributes("maruti",4,"black");
		System.out.println(carr.model);
		System.out.println(carr.noofwheels);
		
		System.out.println(carr.color);
		
		
		
		
	}

}
