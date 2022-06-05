package packageB;

public class ClassA {
	
	
	
  protected String Str="one";
	
	
	  protected void methodAA() {
		
	}
	 
	 
	 public static void main(String[] args) {
		 
		 try {
			ClassA a= new ClassA();
			 a.Str="asdas";
			 a.methodAA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
