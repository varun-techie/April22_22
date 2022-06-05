package firstpackage;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//object create classname ref= new classname();
		Facebookattributes  fb =new Facebookattributes();
		
		fb.firstname ="testone";
		fb.nooffriends=4;
		System.out.println(fb.firstname);
		System.out.println(fb.nooffriends);
		
		fb.mymethod();
		
		
		Facebookattributes fb1= new Facebookattributes();
		fb1.firstname="kumar";
		fb1.nooffriends=44;
		System.out.println(fb1.firstname);
		fb1.mymethod();
		
		
				fb=fb1;
		System.out.println(fb.firstname);
		
		
	Facebookattributes.username="aaa";
	Facebookattributes.staticmethod();
		
		
	}

}
