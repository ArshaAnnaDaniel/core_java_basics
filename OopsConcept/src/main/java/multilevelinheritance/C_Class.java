package multilevelinheritance;

public class C_Class extends B_Class {
	public void mul()
	{
		int mult=a*b;
		System.out.println("Product is:"+mult);
	}
	

	public static void main(String[] args) {
		C_Class ob=new C_Class();
		ob.add();
		ob.sub();
		ob.mul();

	}

}
