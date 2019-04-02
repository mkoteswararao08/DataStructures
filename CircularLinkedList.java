package com.regnant;

public class CircularLinkedList 
{
   Node2 head=null, current=null;
   int s=0;
   void add(int data)
   {
	   Node2 n=new Node2();
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
		   n.nextNode=head;
	   }
   }
   
   /* remove operation using Stack implementation */
   void remove()
   {
	   Node2 n=null;
	   n=head;
	   if(s==0)
	   {
		   head=null;
	   }
	   else
	   {
		   for(int i=1;i<s;i++)
		   {
			   n=n.nextNode;	   
		   }
		   n.nextNode=head;
		   current=n;   
		   s--;
	   }
	   
	   
   }
   void display()
   {
	   Node2 n=head;
	   //for(int i=0;i<s+1;i++) 
		while(head!=n.nextNode)   
	   {
		   System.out.println(n.data);
		   n=n.nextNode;
	   }
	   System.out.println(n.data);
   }
   
}
class Node2
{
	int data;
	Node2 nextNode;
}
