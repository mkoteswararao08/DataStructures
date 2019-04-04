package com.regnant;

public class Set //Set implementation in java
{
	int []a=new int[5];
	int c=0;
	void add(int data)
 	{
        int d=0;
		for(int i=0;i<a.length;i++)
		{
			if(data==a[i])
			{
				System.out.println("given number "+data+" is already present ");
				break;
			}
			else if(a[i]==0)
			{
			   d++;
			}
		}
		if(d>0)
		{
			a[c]=data;			
			c++;
		}
	}
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
} 
