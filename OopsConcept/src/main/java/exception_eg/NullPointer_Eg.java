package exception_eg;

public class NullPointer_Eg {
	public void display()
	{
		String s=null;
		try {
		
		System.out.println(s.length());
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
