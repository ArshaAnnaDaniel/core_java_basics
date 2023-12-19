package encapsulation;

public class Sample_1 {
	private int age;
	private String name;
	public void setter(int a,String b)
	{
		age=a;
		name=b;
		
	}
	public void getter()
	{
		System.out.println("The age is:"+age);
		System.out.println("The name is:"+name);
		
	}

}
