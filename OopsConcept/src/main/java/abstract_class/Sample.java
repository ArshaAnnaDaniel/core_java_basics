package abstract_class;

public class Sample extends Test_abstract{
	public void print()
	{
		System.out.println("it is an abstract method");
	}

	public static void main(String[] args) {
		Sample s=new Sample();
		s.print();
		s.display();

	}

}
