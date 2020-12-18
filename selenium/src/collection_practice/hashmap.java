package collection_practice;

import java.util.HashMap;

import java.util.Set;


public class hashmap {

	public static void main(String[] args) {
		/* In linked hash map value that are inserted or stored will be displayed randomly 
		 * and list will show the duplicate value as well */
		
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(12, "Hello");
		hs.put(22, "Manik");
		hs.put(34, "kumar");
		hs.put(48, "chandel");
		hs.put(54, "kumar");
		hs.put(68, "chandigarh");
		hs.put(79, "CHANDIGARH");
		
	Set<Integer> k=hs.keySet();
	for(Integer a :k)
	{
	System.out.println("The value of the key is "+a);
	System.out.println("The value at key "+a+" Value is :"+hs.get(a));
	
	}
 }
}
