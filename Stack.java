package com.regnant;

public class Stack
{
     /* stack using two cursors*/
//    int arr[]=new int[5];
//    int cursor1=0;
//    int cursor2=0;
//    void push(int data) throws StackOverFlowException
//    {
//    	
//    	if(cursor1<arr.length)
//    	{
//    	  arr[cursor1]=data;
//    	  cursor2=cursor1;
//    	  cursor1++;
//    	}
//    	else
//    	{
//    		StackOverFlowException e=new StackOverFlowException("stack memory value is exceed");
//    		throw e;
//    	}
//    	
//    }
//    int pop() throws StackUnderFlowException
//    {
//    	if(cursor2>=0)
//    	{
//    	 int data=arr[cursor2];
//    	 cursor1=cursor2;
//    	 arr[cursor2]=0;
//    	 cursor2--;
//    	 return data;
//    	}
//    	else
//    	{
//    		StackUnderFlowException s=new StackUnderFlowException("your trying to access value below the Stack range");
//    		throw s;
//    	}
//    }
    
    
    
    
    int arr[]=new int[5];
    int cursor=0;
    void push(int data) throws StackOverFlowException
    {
    	
    	if(cursor<arr.length)
    	{
    	  arr[cursor]=data;
    	  cursor++;
    	  
    	}
    	else
    	{
    		StackOverFlowException e=new StackOverFlowException("stack memory value is exceed");
    		throw e;
    	}
    	
    }
    int pop() throws StackUnderFlowException
    {
    	if(cursor>0)
    	{
	    	 cursor--;
	    	 int data=arr[cursor];
	    	 arr[cursor]=0;
	    	 return data;
    	}
    	else
    	{
    		StackUnderFlowException s=new StackUnderFlowException("your trying to access value below the Stack range");
    		throw s;
    	}
    }    
}

class StackOverFlowException extends Exception
{
	StackOverFlowException(String msg)
	{
		super(msg);
	}
	
}

class StackUnderFlowException extends Exception
{
	StackUnderFlowException(String msg)
	{
		super(msg);
	}
}
 