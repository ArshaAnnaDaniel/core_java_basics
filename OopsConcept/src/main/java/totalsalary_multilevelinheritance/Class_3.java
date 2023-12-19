package totalsalary_multilevelinheritance;

public class Class_3 extends Class_2{
	int total;
	public void total()
	{
		total=basic_pay+hra-pf-deduction+bonus;
	}
	public void salary()
	{
		
		System.out.println("Salary slip:");
		System.out.println("the basic_pay is:"+basic_pay);
		System.out.println("the deduction is:"+deduction);
		System.out.println("the hra is:"+hra);
		System.out.println("the pf is:"+pf);
		System.out.println("the bonus is:"+bonus);
		System.out.println("the total salary is:"+total);
	}

	public static void main(String[] args) {
		Class_3 ob=new Class_3();
		ob.display();
		ob.hra();
		ob.pf();
		ob.total();
		ob.salary();

	}

}
