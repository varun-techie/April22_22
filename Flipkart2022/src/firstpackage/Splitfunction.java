package firstpackage;

public class Splitfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="today is a good day";
		
		String[] str = s.split("a");
		
		System.out.println(str[3]);
		
		
		for(String sa:str) {
			
			System.out.println(sa);
			
			if(sa.equals("tod")) {
				
				System.out.println("value is there");
				break;
			}
		}
		
	}

}
