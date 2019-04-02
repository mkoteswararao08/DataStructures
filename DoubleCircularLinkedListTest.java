package com.regnant;

public class DoubleCircularLinkedListTest 
{
   public static void main(String [] args)
   {
	   DoubleCircularLinkedList L=new DoubleCircularLinkedList();
	   L.add(25);
	   L.remove();
	   L.add(35);
	   L.add(45);
	  // L.remove();
       L.remove();
       L.add(55);
       L.add(65);
       
	   L.display();
   }
}
