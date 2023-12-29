package exception_eg;

public class NullPointer_Eg {
	public void display()
	{
		String s=null;
		try {
		int length=s.length();
		System.out.println(length);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		NullPointer_Eg n=new NullPointer_Eg();
		n.display();
		System.out.println("print the statement");

	}

}
