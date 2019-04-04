package com.regnant;

public class ExponentialSearchInArray 
{
   int a[]= {1,5,10,14,17,20,25,30,35,40,45,60,100};
   int n=a.length;
   void exponentialSearch(int data)
   {
	   if(a[0]==data)
	   {
		   System.out.println(+data+ " number is present in given array at index position 0 ");
		   
	   }
	   int i=1;
	   while(i<n && a[i]<=data)
	   {
		   i=i*2;
	   }
	  
	   /*if loop to find minimum value of i and n*/
	   int z=0;
	   if(i>n)
	   {
		    z=n;
	   }
	   else if(i<n)
	   {
            z=i;	   
	   }
	   
	   binarySearch(i/2,z,data);
   }
   void binarySearch(int start,int end,int data)
   {
	   int middle=(start+end)/2;  
	   if(data<=a[middle])
	   {
		   for(int i=start;i<=middle;i++)
		   {
			   if(data==a[i])
			   {
	    			System.out.println(+data+ " number is present in given array at index position "+i);

			   }
		   }
	   }
	   else if(data>a[middle])
	   { 
		   for(int i=middle;i<end;i++)
		   {
			   if(data==a[i])
			   {
	    			System.out.println(+data+ " number is present in given array at index position "+i);

			   }
		   }  
	   }
   }
}