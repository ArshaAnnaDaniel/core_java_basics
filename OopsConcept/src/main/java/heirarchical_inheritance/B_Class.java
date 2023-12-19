package heirarchical_inheritance;

public class B_Class extends A_Class {
	public void sub()
	{
		int dif=a-b;
		System.out.println("Sub is:"+dif);
		
	}

	public static void main(String[] args) {
		B_Class ob=new B_Class();
		ob.add();
		ob.sub();
		

}
}
