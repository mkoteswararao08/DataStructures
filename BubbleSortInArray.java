package com.regnant;

import java.util.Arrays;

public class BubbleSortInArray
{
	int a[]= {23,1,45,24,65,34,90,76,56,28};
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
	   System.out.println("Array Elements after sorting are:");
	   System.out.println(Arrays.toString(a));
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   }
   }
}
