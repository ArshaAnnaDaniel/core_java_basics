package exception_eg;

public class Finally_eg {
	public void display()
	{
		int a=10;
		try {
		int b=a/0;
		System.out.println(b);
		}
		finally {
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
		Finally_eg f=new Finally_eg();
		System.out.println("statement");
		f.display();
		System.out.println("the exception is handled");

	}

}
