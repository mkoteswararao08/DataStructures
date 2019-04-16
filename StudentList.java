package com.regnant;
import java.util.*;

public class StudentList //Adding user defined objects to ArrayList in Java
                         //User-defined class objects in Java ArrayList    
{
   List<Student> getStudentList()
   {
	   List <Student> studentlist=new ArrayList <Student>();
	   Student s=new Student();
	   s.id=3315204;
	   s.name="koti";
	   s.course="mech";
       s.phno="9840360764";
       Address add=new Address();
       add.area="swarna";
       add.city="chirala";
       add.state="AP";
       s.address=add;
       studentlist.add(s);
       
       Student s2=new Student();
       s2.id=3315249;
       s2.name="murali";
       s2.course="mech";
       s2.phno="9540025417";
       Address add2=new Address();
       add2.area="podili";
       add2.city="podili";
       add2.state="AP";
       s2.address=add2;
       studentlist.add(s2);
       
     return studentlist;  
   }
}

class Student
{
	int id;
	String name;
	String course;
	String phno;
	Address address;
	
}
class Address 
{
	String area;
	String city;
	String state;
}