package com.regnant;

import java.util.*;


public class IteratorInList //Iterator in List
{
  void getList()
  {
	  List <String> user=new ArrayList <String>();
	  user.add("koti");
	  user.add("murali");
	  user.add("sainath");
	  user.add("harsha");
	  
	  Iterator <String> it=user.iterator();
	  while(it.hasNext())
	  {
		  String s=  it.next();
		  System.out.println(s); 
	  }
			 
  }
	
}
