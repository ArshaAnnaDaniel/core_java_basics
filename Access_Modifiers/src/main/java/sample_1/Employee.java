package sample_1;


import sample_2.Employee_Address;

public class Employee {
	static String company_name ="HCL";
	String name;
	int id;
	Employee_Address ea;
	public Employee(String n,int a,Employee_Address d)
	{
	name=n;
	id=a;
	ea=d;
	}
	public void display()
	{
		System.out.println("company name is:"+company_name);
		System.out.println("employee name is:"+name);
		System.out.println("employee id is:"+id);
		System.out.println("employee address is:"+ea.house_no+" "+ea.street+" "+ea.district+" "+ea.pin);
	}
	

	public static void main(String[] args) {
		
		Employee_Address ad1=new Employee_Address(1233,"mavelikara","alappuzha",690101);
		Employee ob1=new Employee("Arsha",123,ad1);
		ob1.display();
		System.out.println("***************************************");
		Employee_Address ad2=new Employee_Address(1333,"mavelikara","alappuzha",690102);
		Employee ob2=new Employee("Anna",133,ad2);
		ob2.display();
		System.out.println("***************************************");
		Employee_Address ad3=new Employee_Address(1433,"mavelikara","alappuzha",690103);
		Employee ob3=new Employee("Ann",143,ad3);
		ob3.display();
		System.out.println("***************************************");
		Employee_Address ad4=new Employee_Address(1533,"mavelikara","alappuzha",690104);
		Employee ob4=new Employee("manu",153,ad4);
		ob4.display();
		System.out.println("***************************************");
		Employee_Address ad5=new Employee_Address(1633,"mavelikara","alappuzha",690105);
		Employee ob5=new Employee("neenu",163,ad5);
		ob5.display();

	}

}
