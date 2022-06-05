package firstpackage;

public class Facebookattributes {
	
	
	String firstname;
	int nooffriends;
	
	static String username;
	
	
	public void mymethod() {
		int a=10;
		String s="test";
		System.out.println("without static");
		//nonstatic direct or object????????????????????????????????? 
		//static direct
		staticmethod();
		System.out.println(firstname);
	}
	
	
	public static void staticmethod() {
		System.out.println("staticmethod");
	}
	
	
	public static void main(String[] args) {
		username="";
		staticmethod();
		
		//nonstatic
		Facebookattributes fbb= new Facebookattributes();
		fbb.username="asdasd";
		fbb.mymethod();
		
	}

}
