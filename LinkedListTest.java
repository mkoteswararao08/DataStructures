package com.regnant;

public class LinkedListTest 
{
    public static void main(String []args)
    {
    	LinkedList L=new LinkedList();
    	L.add(25);
    L.remove();
    	L.add(35);
    	L.add(45);
    	L.add(55);
	L.remove(55);
    	L.add(65);
       	L.remove();
    	L.add(75);
    
    
    	L.add(115);
    	
    	L.add(85);
    	L.remove();
    	L.add(95);
     	L.add(105);
     	L.remove1(2);
     	int size=L.size();
     	System.out.println("size of given linked list is:" +size);
     	int max=L.max();
     	System.out.println("maximum value in given set of nodes is:"+max);
        int min=L.min();
     	System.out.println("Minimum value in given set of nodes is:"+min);
     	L.display();
    }
}
