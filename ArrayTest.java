package com.regnant;

import java.util.Scanner;
public class ArrayTest 
{
   public static void main(String []args)
   {  
	   Scanner e=new Scanner(System.in);
	   Array a=new Array();
	   String arr[]=new String[4];
	   System.out.println("Enter The String Values");
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=e.nextLine();
		   
	   }
	   arr=a.add(arr);
	   System.out.println("Enter the values of new Elements:");
	   for(int i=4;i<arr.length;i++)
	   {
		   arr[i]=e.nextLine();
	   }
	   System.out.println("Array values after adding new element is:");
		for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
			
		 }

		
		System.out.println("-------------------------------------------------------------------");
	   
	   String s[]=new String[4];
	   System.out.println("enter string values");
	   for(int i =0;i<s.length;i++)
	   {
		   s[i]=e.nextLine();
	   }
	  
	   
	   
	   
	   
	   
	   
	   s=a.remove(s);
	   System.out.println("Array values after removing given number of elements is:");
	   for(int i=0;i<s.length;i++)
	   {
		   System.out.println(s[i]);
		 
	   }
	   
	 
   }
}
