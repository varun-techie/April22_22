package firstpackage;

public class Methodprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		add();
		add();
		add();

		int a = addnew();
		System.out.println(a);

		String b = addstring();
		System.out.println(b);

		int d = 100;
		int e = 120;
		boolean c = getabc();

		// logical operators and(&&) or(||)
		if (a > d || a < e) {
			System.out.println("true");

		}

		if (getabc() || getxyz()) {
			System.out.println("true here");
		}

	}

	public static boolean getabc() {

		return false;
	}

	public static boolean getxyz() {

		return true;
	}

	public static void add() {

		int a = 10;
		int b = 12;
		System.out.println(a + b);

	}

	public static void add(int c, int d, int a) {

		int e = c + d;
		System.out.println(e);

	}

	public static int addnew() {
		int a = 12;
		int b = 12;
		int c = a + b;

		return c;
	}

	public static String addstring() {

		String s = "kumar";
		return s;
	}

}
