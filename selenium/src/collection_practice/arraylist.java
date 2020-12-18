package collection_practice;

import java.util.ArrayList;


public class arraylist {
	
		public static void main(String[] args) {
			
			/* In array list value that are inserted or stored will be displayed in the order 
			 * and list will show the duplicate value as well 
			 * can act as list only because only list is implemented
			 * it uses array to store the element hence data accessing is fast as compared to manipulation due to index change in case of deletion */
			
			
			ArrayList<Integer> hs= new ArrayList<Integer>();
			hs.add(433);
			hs.add(224);
			hs.add(224);
			hs.add(433);
			hs.add(555);
			hs.add(664);
			
			for(Integer i:hs)
				System.out.println("The value inserted in Linked List set is "+i);
		      }

}
