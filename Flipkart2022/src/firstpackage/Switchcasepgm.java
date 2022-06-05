package firstpackage;

public class Switchcasepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.7 int ,char
//1.8 string
		int day=2;
		String fun="fan";
		
		switch (fun) {
		case "bulb":
			System.out.println("monday");
			break;
		case "tube":
			System.out.println("tuesday");
			break;
		case "fan":
			System.out.println("wednesday");
			break;
		default:
			System.out.println("none");
			break;
		}
		
		
		for(int i=1;i<5;i++) {
			System.out.println(i);
			if(i==3) {
				System.out.println("asadasd");
				continue;
			}
			
		}
		
	}

}
