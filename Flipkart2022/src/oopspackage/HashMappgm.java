package oopspackage;

import java.util.HashMap;
import java.util.Map;

public class HashMappgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//key value pair
		//map interface
		//nonsynchronised ,hashtable--synchronised
		HashMap<Integer, String>  str = new HashMap<Integer,String>();
		
		str.put(1, "one");
		str.put(1, "oneagain");
		str.put(2, "two");
		str.put(3,null);
		
		for(Map.Entry<Integer, String> hs:str.entrySet()) {
			System.out.println(hs.getKey()+" "+hs.getValue());
			
			if(hs.getKey().equals(1)) {
				//action
				//break
			}
		}
		
		
		
		for(Integer i:str.keySet()) {
			System.out.println(i);
		}
		
		
		for(String s:str.values()) {
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
