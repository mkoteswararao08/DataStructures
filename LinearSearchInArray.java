package com.regnant;

public class LinearSearchInArray 
{
    int a[]= {21,43,23,95,23,65,98,42,35,75};
    void linearSearch(int data)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(data==a[i])
    		{
    			System.out.println(+data+ " number is present in given array at "+i+" index position");
    		}
    	}
    }
    
}
