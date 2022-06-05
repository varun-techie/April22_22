package firstpackage;

public class Stringfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="today is a good day";
		
		
		
		//functions/methods
		System.out.println(str.length());
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 17));
		
		
		System.out.println(str.replace('d', 'D'));
		System.out.println(str.replaceAll("good", "fine"));
		
		//2 d a 3
		System.out.println(str.indexOf('z'));
		//str.indexof("o",str.indexof("o")+1),ordinalindexof
		System.out.println(str.charAt(2));
		
		
		String s=" test ";
		System.out.println(s.trim());
		
		
		
		
		
	}

}
