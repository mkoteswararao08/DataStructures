package com.regnant;

public class LinkedList 
{
   Node head=null,current=null;
   int s=0;
   void add(int data)
   {
	   Node n=new Node();
	   n.data=data;
	   
	   if(head==null)
	   {
		   head=n;
		   current=n;
	   }
	   else
	   {
		   s++;
		   current.nextNode=n;
		   current=n;
	   }
   }
   
   /* remove operation using Stack implementation */
   void remove()
   {
	   Node n1=null;
	   n1=head;
	  
	   if(s==0)  //if  we removing element present in  first node
	   {
		   
		   head=null;
	   }
	   else 
	   {
		   for(int i=1;i<s;i++)
		   {
			   n1=n1.nextNode;
		   }
		   s--;
		   n1.nextNode=null;
		   current=n1;
		   
	   }
	  
   }
   
   /*remove operation by specifying required data*/  
   void remove(int data)
   {
	   Node t=null;  
	   Node n1=head;
	  if(head.data==data) //if we removing element present in  first node
	  {
		 head=head.nextNode;
		 
	  }
	  else
	  {
		  while(n1!=null)
		     {
		    	 if(n1.data==data)
		    	 {
		    		/*if we removing last added element then current position need to be shifted to previous position,
		    		 * so that we can add other elements from current position. */ 
		    		if(n1.nextNode==null)
		    		{
		    			current=t;
		    		}
		    		else 
		    		{
		    			t.nextNode=n1.nextNode;
		    		}
		    		break;
		    	 }
		    	 t=n1;
		    	 n1=n1.nextNode;
		     }  
	  }	 
	   
   }
   
   /*remove operation based on position of node*/
   void remove1(int p)
   {
	   Node t=null;  
	   Node n1=head;
	   int index=1;
	  if(p==1) //if we removing element present in  first node
	  {
		 head=head.nextNode;
		 
	  }
	  else
	  {
		  while(n1!=null)
		     {
		    	 if(index==p)
		    	 {
		    		if(n1.nextNode==null)
		    		{
		    			current=t;
		    		}
		    		else 
		    		{
		    			t.nextNode=n1.nextNode;
		    		}
		    		break;
		    	 }
		    	 index++;
		    	 t=n1;
		    	 n1=n1.nextNode;
		     }  
	  }	 	   
   }
   
   /*method to find size of linked list*/
   int size()
   {
	   Node n=head;
	   int count=0;
	   while(n!=null)
	   {
		   count++;
		   n=n.nextNode;   
	   }
	   return count;
   }
   /*method to find maximum element in linked list*/
   int max()
   {
	   Node n=head;
	   int max;
	   max=head.data;
	   while(n!=null)
	   {
		   if(max<n.data)
		   {
			   max=n.data;
		   }
		   n=n.nextNode;
	   }
	   return max;
   }
   /*method to find minimum element in linked list*/
   int min()
   {
	   Node n=head;
	   int min;
	   min=head.data;
	   while(n!=null)
	   {
		   if(min>n.data)
		   {
			   min=n.data;
		   }
		   n=n.nextNode;
	   }
	   return min;
   }
   
   
   void display()
   {
	   Node n=head;
	   System.out.println("-------------------------------");
	   while(n!=null)
	   {
		   System.out.println(n.data);
		   n=n.nextNode;
	   }
   }
}

class Node 
{
   int data;
   Node nextNode;
}

