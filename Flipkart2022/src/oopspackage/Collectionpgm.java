package oopspackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Collectionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arraylist
		//generics--specify an object
		
		//ordered,duplicates alloweed
		ArrayList<String>  str =new ArrayList<String>();
		
		//java wrapper class(datatype to object
		ArrayList<Integer> stt= new ArrayList<Integer>();
		
		List<String>  st = new ArrayList<String>();//selenium webdriver
		//methods same,skelton,define
		
		str.add("testone");
		str.add("testtwo");
		str.add("testthree");
		str.add("testone");
		
		System.out.println(str.get(0));
		
		str.add(1, "dummy");
		
		//iterator
		
		
		for(String s: str) {
			
			System.out.println(s);
		}
		
		
		//unordered,unique values allowed
		HashSet<String> htr= new HashSet<String>();
		htr.add("one");
		htr.add("add");
		htr.add("two");
		htr.add("two");
		
		for(String ss:htr) {
			
			
			System.out.println(ss);
		}
		
		
	}

}
