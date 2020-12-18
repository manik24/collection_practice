package collection_practice;

import java.util.LinkedHashSet;

public class linkedhashset 
{


	public static void main(String[] args) {
		
		
		/* In linked hash set value that are inserted or stored will be displayed in the order */
		
		LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
		hs.add(224);
		hs.add(224);
		hs.add(34);
		hs.add(433);
		hs.add(555);
		hs.add(664);
		
		for(Integer i:hs)
			System.out.println("The value inserted in Linked hash set is "+i);
	      }
	

}
