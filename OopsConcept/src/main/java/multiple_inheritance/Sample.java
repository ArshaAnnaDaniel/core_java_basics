package multiple_inheritance;

public class Sample implements Printable,Showable {
	@override
	public void show()
	{
		System.out.println("this is to show");
	}
	@override
    public void print()
     {
    	System.out.println("this is to print");

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.print();
		s.show();
	}
}
		


