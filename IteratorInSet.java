package com.regnant;
import java.util.*;

public class IteratorInSet //Iterator in Set
{
   void getset()
   {
	   Set <Integer> number=new  HashSet<Integer>();
	   number.add(35);
	   number.add(55);
	   number.add(98);
	   number.add(100); 
	   number.add(120);
	   Iterator <Integer> it=number.iterator();
	   while(it.hasNext())
	   {
		   int n=it.next();
		   System.out.println(n);
	   }
   }
}
