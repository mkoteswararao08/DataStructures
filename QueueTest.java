package com.regnant;

import java.util.Arrays;

public class QueueTest 
{
   public static void main(String []args)
   { 
	 Queue q=new Queue();
     try 
     {    
    	   q.push(10);
		   q.push(20);
		   q.push(30);
		   q.push(40);
		   System.out.println(q.pop());
		   q.push(50);
		   System.out.println(Arrays.toString(q.arr));
		   q.push(60);
		   System.out.println(Arrays.toString(q.arr));
		   System.out.println(q.pop());
		   System.out.println(q.pop());
		   System.out.println(q.pop());
		   System.out.println(q.pop());
		   q.push(80);
		   System.out.println(Arrays.toString(q.arr));
		   System.out.println("-------------------------");
		   
		   System.out.println("Queue values after pop are:");
		   for(int i=0;i<q.arr.length;i++)
		   {
			   System.out.println(q.arr[i]);
		   }
	 }
	 catch(QueueOverFlowException e)
	 {
		 e.getMessage();
		 e.printStackTrace();
	 }
	 catch(QueueUnderFlowException s)
	 {
		 s.getMessage();
		 s.printStackTrace();
	 }
   }
}
