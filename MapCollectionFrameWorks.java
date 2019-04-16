package com.regnant;

import java.util.*;

public class MapCollectionFrameWorks //HashMap and LinkedHashMap in Map
{
   void hashMap()   //vector, hash table
   {
	   HashMap <String,Integer> table=new HashMap <String,Integer>();
	   table.put("a", 45);
	   table.put("b", 200);
	   table.put("b", 300);
	   System.out.println(table.get("a"));
	   System.out.println("----------------------------------------------------------");
   }
   void linkedHashMap()
   {
	   LinkedHashMap <Integer,String> table=new LinkedHashMap <Integer,String>();
	   table.put(1, "koti");
	   table.put(2,"molabanti");
	   table.put(3, "sainath");
	   table.remove(1);
	   table.put(1, "koteswara rao");
	   System.out.println(table.get(1));
   }
}
