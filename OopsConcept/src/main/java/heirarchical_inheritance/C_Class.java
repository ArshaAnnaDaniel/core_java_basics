package heirarchical_inheritance;

public class C_Class extends A_Class {
	public void mul()
	{
		int prod=a*b;
		System.out.println("product is:"+prod);
	}

	public static void main(String[] args) {
		C_Class ob=new C_Class();
		ob.add();
		ob.mul();

	}

}
