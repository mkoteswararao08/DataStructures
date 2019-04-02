package com.regnant;

public class DoubleLinkedList 
{
	Node1 head=null,current=null;
	void add(int data)
	{
		Node1 n=new Node1();
		n.data=data;
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
		}
	}
	
	/* remove operation using Stack implementation */
	void remove()
	{
		if(current.previousNode==null) //if we removing element present in  first node
		{
			head=null;
		}
		else 
		{
		
			Node1 n1=null;
			n1=current.previousNode;
			n1.nextNode=null;
			current=n1;
		}
			
	}
	
	
	void display()
	{
		Node1 n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.nextNode;
		}
	}
	void reverseDisplay()//to print data from reverse direction
	{
		Node1 n=current;
		System.out.println("----------------------------------------------");
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.previousNode;
		}
	}
}
class Node1 
{
   int data;
   Node1 previousNode; 
   Node1 nextNode;
}