package interface_eg;

public class Sample implements Test{

	@Override
	public void print() {
		System.out.println(a);
		System.out.println(s);
		System.out.println("this is abstract method from interface");
		// TODO Auto-generated method stub
		
	}
	public void display()
	{
		System.out.println("this method from child class");
	}
	public static void main(String args[])
{
	Sample s=new Sample();
	s.display();
	s.print();
		Test t=new Sample(); //interface reference
		t.print(); //only interface data will get
		System.out.println(a);
		System.out.println(s);
}

}
