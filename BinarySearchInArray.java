package com.regnant;

import java.util.Arrays;

public class BinarySearchInArray 
{
   int a[]= {145,1,25,36,81,92,45,64,31};
   void binarySearch(int data)
   {
	   int n=a.length;
	   if(data<=a[n/2])
	   {
		   for(int i=0;i<=n/2;i++)
		   {
			   if(data==a[i])
			   {
	    			System.out.println(+data+ " number is present in given array at index position "+i);

			   }
		   }
	   }
	   else if(data>a[n/2])
	   { 
		   for(int i=n/2;i<n;i++)
		   {
			   if(data==a[i])
			   {
	    			System.out.println(+data+ " number is present in given array at index position "+i);

			   }
		   }
		   
	   }
   }
   void bubbleSort()
   {
	   int c=0;
	   for(int j=0;j<a.length;j++)
	   {
		   for(int i=0;i<a.length-1;i++)
		   {
			   if(a[i]>a[i+1])
			   {
				   c=a[i];
				   a[i]=a[i+1];
				   a[i+1]=c;
			   }
		   }   
	   }	   
   }
   void display()
   {
	   System.out.println(Arrays.toString(a));
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   }
   }
}
