package collection;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		
		
		/* In linked hash set value that are stored will be displayed in the ascending order */
		
		TreeSet<Integer> hs= new TreeSet<Integer>();
		hs.add(224);
		hs.add(224);
		hs.add(224);
		hs.add(433);
		hs.add(555);
		hs.add(664);
		
		for(Integer i:hs)
			System.out.println("The value inserted in Tree set is "+i);
	      }
	
}
