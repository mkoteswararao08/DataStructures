package com.regnant;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetCollectionFrameWorks //HashSet and LinkedHashSet in Set
{
   void hashSet()
   {
	   HashSet <Integer> y=new HashSet <Integer> ();
	   y.add(12);
	   y.add(45);
	   y.add(78);
	   y.add(98);
	   y.add(12);//hash set doesn't take duplicates 
	   System.out.println("HashSet:");
	   for(int s:y)
	   {
		   System.out.println(s);
	   }	
	   System.out.println("---------------------------------------------------");
   }
   void linkedHashSet()
   {
	   LinkedHashSet <Integer> z=new LinkedHashSet <Integer>();
	   z.add(75);
	   z.add(82);
	   z.add(95);
	   z.add(75);
	   z.add(122);
	   System.out.println("LinkedHashSet:");
	   for(int e:z)
	   {
		   System.out.println(e);
	   }
	   
	   
   }
}
