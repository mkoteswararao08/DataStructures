package com.regnant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class ListIteratorInList //ListIterator In List
{
   void getList()
   {
	   List <String> user=new ArrayList <String>();
		  user.add("koti");
		  user.add("murali");
		  user.add("sainath");
		  user.add("harsha");  
		  
		  System.out.println("forward direction List:");
		  ListIterator <String> it=user.listIterator();
		  while(it.hasNext())
		  {
			  String s=it.next();
			  System.out.println(s);
		  }
		  
		  System.out.println("----------------------------------");
		  System.out.println("backword direction List:");
		  ListIterator <String> it1=user.listIterator(4);
		  while(it1.hasPrevious())
		  {
			  String s=it1.previous();
			  System.out.println(s);
		  }
		  
		  
		  
		 //ListIterator is only possible in List 
		  /*    ListIterator is not possible in set*/
//		  Set <Integer> number=new  HashSet<Integer>();
//		   number.add(35);
//		   number.add(55);
//		   number.add(98);
//		   number.add(100); 
//		   number.add(120);
//		   
//		   ListIterator <Integer> it2=number.iterator();
		  
		  /* ListIterator is not possible in Map, because keyset() method returns only set type data, 
		   *  in set ListIterator is not possible */
//		  Map <Integer,String> user2 =new HashMap <Integer,String>();
//			user2.put(1, "Koti");
//			user2.put(2, "Murali");
//			user2.put(3, "Sainath");
//			user2.put(4, "Harsha");
//			
//			Set <Integer> keyset=user2.keySet();
//			ListIterator <Integer> it3=keyset.iterator();
			
			
		   
   }
}
