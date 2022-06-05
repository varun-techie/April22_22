package oopspackage;

public class Encappgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			EncapAttributes en =new EncapAttributes();
System.out.println(en.getI());
System.out.println(en.getS());

en.setS("testone");
		//log(pass text print)	
System.out.println(en.getS());
		} catch (Exception e) {
			//fail text print
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
