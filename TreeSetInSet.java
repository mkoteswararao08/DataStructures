package com.regnant;
import java.util.*;

public class TreeSetInSet //Sorting Integers in set using Treeset
{
  void getSortedSet()
  {
	  SortedSet <Integer> user= new <Integer> TreeSet();
	  user.add(52);
	  user.add(86);
	  user.add(12);
	  user.add(89);
	  user.add(2);
	  
	  Iterator <Integer> it=user.iterator();
	  while(it.hasNext())
	  {
		  int i=it.next();
		  System.out.println(i);
	  }
  }
}
