package super_keyword;

public class Parent_class {
	int a=10,b=20;
	public void add() {
		int sum=a+b;
		System.out.println("the sum is:"+sum);
		
	}

	public void mul() {
		
		int mult=a*b;
		System.out.println("The product is:"+mult);

	}
	public Parent_class() {
		System.out.println("This is a parent class constructor");
		
	}
	public Parent_class(int a) {
		this();
		System.out.println("value of a :"+a);
		
	}

}
