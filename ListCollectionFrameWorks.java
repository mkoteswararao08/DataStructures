package com.regnant;

import java.util.ArrayList;
import java.util.*;
public class ListCollectionFrameWorks //ArrayList and LinkedList in List
{
   void arrayList()
   {
	   ArrayList <Integer> uselist=new ArrayList <Integer> ();
	   uselist.add(625);
	   uselist.add(625);
	   uselist.add(200);
	   uselist.add(500);
	   uselist.add(1000);
	   
	   System.out.println("ArrayList:");
	   for(int x:uselist)//advanced for loop
	   {
		   System.out.println(x);
	   }
      System.out.println("-----------------------------------------");
//	   long start=System.currentTimeMillis();
//	   for(int i=0;i<1000000;i++)
//	   {
//		   uselist.add(i);
//	   }
//	   for(int i=0;i<100000;i++) //old for loop
//	   {
//		   uselist.remove(i);
//	   }
//	   for(int x:uselist)
//	   {
//		   System.out.println(x);
//	   }
//	   long end=System.currentTimeMillis(); 
//	   System.out.println("time before execution:"+start);
//	   System.out.println("time after execution:"+end);
//	   System.out.println("Total time taken in arraylist:"+(end-start));
//	   System.out.println("--------------------------------------------------");

   }
   
   void linkedList()
   {
	   LinkedList <Integer> x=new LinkedList <Integer> ();
      x.add(1000);
      x.add(2000);
      x.add(3000);
      x.add(4000);
      System.out.println("LinkedList:");
      for(int y:x)//advanced for loop
	   {
		   System.out.println(y);
	   }
      System.out.println("-----------------------------------------");
//      long start=System.currentTimeMillis();
//	   for(int i=0;i<1000000;i++)
//	   {
//		   x.add(i);
//	   }
//	   for(int i=0;i<100000;i++) //old for loop
//	   {
//		   x.remove(i);
//		   
//	   }
//	   for(int y:x)
//	   {
//		   System.out.println(y);
//	   }
//	   long end=System.currentTimeMillis(); 
//	   System.out.println("time before execution:"+start);
//	   System.out.println("time after execution:"+end);
//	   System.out.println("Total time taken in linkedlist:"+(end-start));     
   }
}

