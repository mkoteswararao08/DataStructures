package com.regnant;

public class Queue 
{
   int arr[]=new int[5];
   int cursor1=0;
   int cursor2=0;
   void push(int data) throws QueueOverFlowException
   {
	  if(cursor1<arr.length)
	  {
		   arr[cursor1]=data;
		   cursor1++;
	  }
	  else
	  {
		  QueueOverFlowException e=new QueueOverFlowException("Queue memory value is exceed");
  		  throw e;
	  }
   }
   int pop() throws QueueUnderFlowException
   {
		 int data=arr[cursor2];	 
		 arr[cursor2]=0;
		 cursor1--;
		 for(int i=0;i<arr.length-1;i++)
	     {
			  int c=arr[i];
			  arr[i]=arr[i+1];
			  arr[i+1]=c;
	     }
	     if(data==0)
	     {
	    	 QueueUnderFlowException s=new QueueUnderFlowException("Queue does not contains any values");
	    	 throw s;
	     }
	     else
	     {
	    	 return data;
	     }
	 
   }
}

class QueueOverFlowException extends Exception
{
	QueueOverFlowException(String msg)
	{
		super(msg);
	}
	
}
class QueueUnderFlowException extends Exception
{
	QueueUnderFlowException(String msg)
	{
		super(msg);
	}
	
}