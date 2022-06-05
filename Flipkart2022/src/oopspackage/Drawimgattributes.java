package oopspackage;

public interface Drawimgattributes {
	
	
	public static final String s="one";
	
	//abstract methods--incomplete methods
	public abstract void pencil();
	public void watercolor();
	public void sketch();
	
	public void addmethod();
	
	
	//normal method
	default void methodA() {
		
		System.out.println("methoda");
	}
	
	

}
