package com.regnant;

import java.util.Scanner;

public class Array
{
   
   Scanner e=new Scanner(System.in);
   String [] add(String []arr)
   {
	   
	 System.out.println("Enter the number of elements to be added to given array");
	 int x=e.nextInt(); 
	 arr= copyArray(arr,x); 
	 return arr;
   }
   String [] remove(String s[])
   {
	  System.out.println("Enter the number of elements to be removed in given array");
	  int y=-e.nextInt();
	  s=copyArray(s,y);
	   return s;
	  
	
	   
   }
   
   
   String [] copyArray(String x[], int n)
   {
	   int newSize=x.length+n;
	   String narr[]=new String[newSize];
	   int cond;
	   if(n>0)
	   {
		  cond=x.length; 
		   
	   }
	   else 
	   {
		   cond=narr.length;
	   }
	   for(int i=0;i<cond;i++)
	   {
		   narr[i]=x[i];
		   
	   }
			  
	   return narr;        
   }
   
}
