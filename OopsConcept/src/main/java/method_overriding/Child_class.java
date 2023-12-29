package method_overriding;

public class Child_class extends Parent_class{
	@Override          
	public void print()
	{
		//a=20;
		System.out.println("It is a child class");
		super.print();
	}

	public static void main(String[] args) {
		Child_class s=new Child_class();
		s.print();
		

	}

}
