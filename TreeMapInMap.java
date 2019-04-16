package com.regnant;
import java.util.*;

public class TreeMapInMap //sorting Integers in Map using TreeMap
{
   void getSortedMap()
   {
	   SortedMap <Integer,String> user=new TreeMap <Integer,String>();
	   user.put(5, "koteswararao");
	   user.put(10, "murali");
	   user.put(1,"Sainath");
	   user.put(15, "uma");
	   
	   Set <Integer> keyset1=user.keySet();
	   Iterator<Integer> it=keyset1.iterator();
	   while(it.hasNext())
	   {
		   int i=it.next();
		   String s=user.get(i);
		   System.out.println(i+"------"+s);
	   }
	   
   }
}
