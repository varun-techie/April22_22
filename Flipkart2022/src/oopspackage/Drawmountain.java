package oopspackage;

public class Drawmountain implements Drawimgattributes,Drawingcheers{
//subclass-drawmountain
//no object for interface and abstract
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawmountain draw= new Drawmountain();
		draw.pencil();
		draw.watercolor();
		
		System.out.println(draw.s);
		//draw.s="change me";
		
		
	}

	@Override
	public void pencil() {
		// TODO Auto-generated method stub
		System.out.println("pencil");
	}

	@Override
	public void watercolor() {
		// TODO Auto-generated method stub
		System.out.println("coloring");
	}

	@Override
	public void sketch() {
		// TODO Auto-generated method stub
		System.out.println("sketch");
	}

	@Override
	public void coke() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extramaterial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addmethod() {
		// TODO Auto-generated method stub
		
	}

}
