package com.regnant;

public class CircularLinkedListTest
{
	public static void main(String []args)
	{
		CircularLinkedList L=new CircularLinkedList();
		System.out.println("Circular linked list:");
		L.add(15);
		L.remove();
		L.add(25);
		L.add(35);
		L.remove();
		L.add(45);
		L.add(55);
		L.add(65);
		L.remove();
		
		L.display();
	} 
}
