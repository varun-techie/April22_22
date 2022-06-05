package oopspackage;

public class Stringbuffbuilderpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//immutable
		String s="vignesh";
		String ss= new String("varun");
	concatvignesh(s);
	System.out.println(s);
		
	//stringbuffer and stringbuilder---Mutable
	StringBuffer buff= new StringBuffer("prakash");
	concatprakash(buff);
	System.out.println(buff);
	
	StringBuilder buil = new StringBuilder("vijay");
	concatvijay(buil);
	System.out.println(buil);
	}

	private static void concatvijay(StringBuilder buil) {
		// TODO Auto-generated method stub
		StringBuilder build=buil.append("yes added");
	}

	private static void concatprakash(StringBuffer buff) {
		// TODO Auto-generated method stub
		StringBuffer sbf= buff.append("am adding");
	}

	private static void concatvignesh(String s) {
		// TODO Auto-generated method stub
		String ss=s+"test";
	}
	
	
	
	
	

}
