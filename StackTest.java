package com.regnant;

public class StackTest 
{
   public static void main(String []args)
   {
	   Stack s=new Stack();
	   try
	   {
		   s.push(10);
		   s.push(20);
		   s.push(30);
		   System.out.println( s.pop());
		   System.out.println( s.pop());
		   s.push(40);
		   s.push(50);
		   s.push(60);
		   
		   System.out.println("Stack values after pushing are:");
		   for(int i=0;i<s.arr.length;i++)
		   {
			   System.out.println(s.arr[i]);
		   }
		   
		   System.out.println("----------------------------------");
		   System.out.println("Stack values using pop are:");
		   System.out.println( s.pop());
		   System.out.println( s.pop());
		   System.out.println( s.pop());
		   System.out.println( s.pop());

		   System.out.println("-------------------------------");
		   System.out.println("Stack values after pop is:");
		   for(int i=0;i<s.arr.length;i++)
		   {
			   System.out.println(s.arr[i]);
		   } 
	  }
	  catch(StackOverFlowException e)
	   {
		  e.getMessage();
		  e.printStackTrace();
	   }
	   catch(StackUnderFlowException r)
	   {
		   r.getMessage();
		   r.printStackTrace();
	   }
	   
   }
}
