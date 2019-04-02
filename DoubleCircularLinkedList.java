package com.regnant;

public class DoubleCircularLinkedList 
{
   Node3 head=null,current=null;
   int s=0;
   void add(int data)
   {
	   Node3 n=new Node3();
	   n.data=data;
	   s++;
	   if(head==null)
	   {
		   head=n;
		   current=n;
	   }
	   else
	   {
		   current.nextNode=n;
		   n.previousNode=current;
		   current=n;
		   n.nextNode=head;
		   head.previousNode=n;
	   }
   }
   
   /* remove operation using Stack implementation */
   void remove()
   {
	   if(s==1)
	   {
		   head=null;
	   }
	   else
	   {
		   Node3 n1=null;
		   n1=current.previousNode;
		   n1.nextNode=null;
		   current=n1;
		   
		   n1.nextNode=head;
		   head.previousNode=n1;
	   }
	   s--; //s value need to be reduced each time when we remove, other wise  circular loop will continue to print in display method 
	
   }
   void display()
   {
	   Node3 n=head;
	   for(int i=0;i<s;i++)
	   {
		   System.out.println(n.data);
		   n=n.nextNode;
	   }
//	   while(head!=n.nextNode)
//	   {
//		   System.out.println(n.data);
//		   n=n.nextNode;
//	   }
//	   System.out.println(n.data);
	   
	   
   }
}
class Node3
{
	 int data;
	 Node3 previousNode; 
     Node3 nextNode;
}
