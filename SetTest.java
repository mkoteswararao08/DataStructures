package com.regnant;

public class SetTest //Set implementation in java 
{
   public static void main(String []args)
   {
	   Set s=new Set();
	   s.add(12);
	   s.add(12); //set is not allowed duplicate value 
	   s.add(25);
	   s.add(25);
	   s.add(25);
	   s.add(35);
	   s.display();
   }
}
