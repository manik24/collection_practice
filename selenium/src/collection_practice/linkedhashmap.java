package collection;


import java.util.LinkedHashMap;
import java.util.Set;

public class linkedhashmap {

	public static void main(String[] args) {
		/* In linked hash map value that are inserted or stored will be displayed in the order they are stored 
		 * and list will show the duplicate value as well */
		
		LinkedHashMap<Integer,String> hs=new LinkedHashMap<Integer,String>();
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
