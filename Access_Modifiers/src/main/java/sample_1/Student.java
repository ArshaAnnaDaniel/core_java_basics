package sample_1;

import sample_2.Address;

public class Student {
	static String clgname="karunya";
	int roll_no;
	String name;
	Address ad;
	public Student(int a,String s,Address c)
	{
		roll_no=a;
		name=s;
		ad=c;
		
	}
	public void display()
	{
		System.out.println("student name is:"+name);
		System.out.println("roll no is:"+roll_no);
		System.out.println("clg name is:"+clgname);
		System.out.println("student address is:"+ad.house_no+" "+ad.street+" "+ad.district+" "+ad.pin);
	}
	public static void main(String args[])
	{
		Address ob1=new Address(123,"mavelikara","alappuzha",690101);
		Student ob=new Student(1094,"Arsha",ob1);
		ob.display();
		System.out.println("***************************************");
	    Address ad1=new Address(124,"haripad","fdhg",465879);
	    Student ob2=new Student(1093,"arun",ad1);
	    ob2.display();
	    System.out.println("***************************************");
	    Address ad2=new Address(125,"gfhj","truty",546789);
	    Student ob3=new Student(1095,"manu",ad2);
	    ob3.display();
	    Address ad3=new Address(125,"gfhj","truty",546789);
	    Student ob4=new Student(1095,"manu",ad3);
	    ob3.display();
	    Address ad4=new Address(125,"gfhj","truty",546789);
	    Student ob5=new Student(1095,"manu",ad4);
	    ob3.display();
		
	}

}
