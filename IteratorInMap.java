package com.regnant;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class IteratorInMap //Iterator in Map
{ 
	void getHashMap()
	{
		Map <Integer,String> user =new HashMap <Integer,String>();
		user.put(1, "Koti");
		user.put(2, "Murali");
		user.put(3, "Sainath");
		user.put(4, "Harsha");
		
		/*using entryset() method one set at a time comes and assign to entry object. here set means both key and data */ 
		for(Map.Entry<Integer, String> entry:user.entrySet()) 
		{		
            int i=entry.getKey();	
            String s=entry.getValue();
            System.out.println(i+"-------"+s);
		}
		
		/* keyset() method Returns a {@link Set} view of the keys contained in this map  */
		Set <Integer> keyset = user.keySet();
		for(Integer i:keyset)
		{
			String s=user.get(i);
			System.out.println(i+"   "+s);
		}
		
		Set <Integer> keyset1 =user.keySet();
		Iterator <Integer> it=keyset1.iterator();// Returns an iterator over the elements in this set.
		while(it.hasNext())
		{
			int i=it.next();
			String s=user.get(i);
			System.out.println(i+"____________"+s);
			
		}
		
		/*keyset() method returns only set type data  ,because set does not allows duplicates. 
		 * it never returns List type data.    
		 */
		
	}

}
