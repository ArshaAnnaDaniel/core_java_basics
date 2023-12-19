package Inheritance;

public class Child_class extends Parent_Class {
	public void add()
	{
		int sum=a+b;
		System.out.println("sum is:"+sum);
	}
	public void display()
	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
	Child_class ob=new Child_class();
	ob.display();
	ob.print();
	ob.add();

	}

}
