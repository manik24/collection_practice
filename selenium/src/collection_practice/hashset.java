package collection_practice;

import java.util.HashSet;

public class hashset {

public static void main(String[] args) {
	
	/* In hash set the value are displayed randomly and not in the order they were stored,
	 and the most significant use of set is that user can add duplicate value but it will display single value.
	 duplicate value are not allowed in set.
	 */
	
	HashSet<Integer> hs= new HashSet<Integer>();
	hs.add(24);
	hs.add(224);
	hs.add(34);
	hs.add(433);
	hs.add(555);
	hs.add(664);
	
	for(Integer i:hs)
		System.out.println("The value inserted in hash set is "+i);
      }
}
