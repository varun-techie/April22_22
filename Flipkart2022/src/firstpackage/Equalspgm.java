package firstpackage;

public class Equalspgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=12;
		//==(operator,based on reference)
		System.out.println(a==b);
		
		
		String s="test";
		String s1="test";
		
		System.out.println(s==s1);
		
		//2nd way create
		String s2= new String("test");
		System.out.println(s2);
		//equals method,based on value
		System.out.println(s==s2);//this is totally wrong
		
		if(s.equals(s2)) {
			System.out.println("trueeeeeeeeee am");
		}
		
		//increment /decrement operator
		
		int i=10;
		i++;//i+1
		--i;//i-1
		System.out.println(i++);//i+1 11
		System.out.println(i);//11
		
		
		System.out.println(++i);//12
		System.out.println(i);
		
		
		
		
	}

}
