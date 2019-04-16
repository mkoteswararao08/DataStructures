package com.regnant;

import java.util.*;
public class StudentListTest //Adding user defined objects to ArrayList in Java
{
   public static void main(String []args)
   {
	   StudentList s=new StudentList();
	   List <Student> studentlist;
	   studentlist=s.getStudentList();
	   
	  
	   for(Student d:studentlist)
	   {      
//	     for(int i=0;i<studentlist.size();i++) normal for loop style
//        {   
//		    Student d=studentlist.get(i);
    	   System.out.println("Student id number:"+d.id);
    	   System.out.println("Student number:"+d.name);
    	   System.out.println("Student course"+d.course);
    	   System.out.println("Student phone number:"+d.phno);
    	   System.out.println("Student Address Area:"+d.address.area);
    	   System.out.println("Student Address City:"+d.address.city);
    	   System.out.println("Student Address State:"+d.address.state);
    	   System.out.println("-------------------------------------------------");
       }
   }
}
