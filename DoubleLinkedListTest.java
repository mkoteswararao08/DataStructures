package com.regnant;

public class DoubleLinkedListTest 
{
   public static void main(String []args)
   {
	   DoubleLinkedList L=new DoubleLinkedList();
	   L.add(25);
	   L.remove();
	   L.add(35);
	   L.remove();
	   L.add(45);
	   L.add(55);
       L.add(65);
//	   L.remove();
//	   L.remove();
	   L.display();
	   L.reverseDisplay();
   }
}
