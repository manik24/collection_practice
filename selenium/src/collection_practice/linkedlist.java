package collection;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		/* In linked hash set value that are inserted or stored will be displayed in the order 
		 * and list will show the duplicate value as well 
		 * it use double linked list hence faster in manipulation as no index change is required and insertion and slow in accessing the data
		 * can act as list and queue both  */
		 
		
		LinkedList<Integer> hs= new LinkedList<Integer>();
		hs.add(224);
		hs.add(224);
		hs.add(224);
		hs.add(433);
		hs.add(555);
		hs.add(664);
		
		for(Integer i:hs)
			System.out.println("The value inserted in Linked List set is "+i);
	      }
	
}
