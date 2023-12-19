package super_keyword;

public class Child_class extends Parent_class {
	int a=50,b=40;
	public void sub()
	{
		int sub=a-b;
		System.out.println("the difference is:"+sub);
		System.out.println(super.a);   //super keyword
		super.add();          //method calling with super
		this.division(); //this for current class reference
	}
	public void division() {
		int div=a/b;
		System.out.println("The division is:"+div);
		super.mul();
	}
	public Child_class()
	{
		super(20);
		System.out.println("this is a child class constructor");
		
	}

	public static void main(String[] args) {
		Child_class ob=new Child_class();
		ob.sub();
		//ob.add();

	}

}
