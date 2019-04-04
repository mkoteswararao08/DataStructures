package com.regnant;

import java.util.Arrays;

public class InsertionSortInArray 
{
	int a[]= {99,25,75,84,40,36,83};
	void insertionSort()
	{
		for(int i=1;i<a.length;i++)
		{
			int c=a[i];
			int j=i-1;
			while(j>=0 && a[j]>c)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=c;
		}	
	}	
	void display()
	   {
		   System.out.println("Array Elements after insertion sorting are:");
		   System.out.println(Arrays.toString(a));
		   for(int i=0;i<a.length;i++)
		   {
			   System.out.println(a[i]);
		   }
	   }
}
