package HashSet;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		hs.add("B");
	hs.add("C");
	
	hs.add("Z");
	hs.add(null);
	hs.add(10);
	hs.add("D");
	hs.add("C");  //   Insertion Order is not priserve and duplication is not allowed 
	System.out.println(hs.add("Z"));
	System.out.println(hs);
	}
	

}
