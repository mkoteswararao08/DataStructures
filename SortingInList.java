package com.regnant;
import java.util.*;


public class SortingInList //sorting Integers in List using Collections.sort()
{
   void getSortedList()
   {
	   List <Integer> userlist =new ArrayList <Integer>();
	   userlist.add(89);
	   userlist.add(12);
	   userlist.add(1);
	   userlist.add(900);
	   userlist.add(200);
	    
	   /* Collections.sort method is sorting the 
       elements of ArrayList in ascending order. */
	   Collections.sort(userlist);
	   Iterator <Integer> it=userlist.iterator();
	   while(it.hasNext())
	   {
		   int i=it.next();
		   System.out.println(i);
	   }
	   
	   System.out.println("-------------------------------------");
	   System.out.println("sorting of String data in List using Collections.sort():");
	   List <String> user=new LinkedList <String>();
	   user.add("koti");
	   user.add("uma");
	   user.add("ravi");
	   user.add("vamsi");
	   user.add("murali");
	   
	   Collections.sort(user);
	   Iterator <String>it1 =user.iterator();
	   while(it1.hasNext())
	   {
		   String s=it1.next();
		   System.out.println(s);
		  
	   }
	   
   }
}
