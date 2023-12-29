package exception_eg;

import java.io.IOException;

public class Sample {
	public void display()
	{
		int a=10;
		try {
		int b=a/0;
		System.out.println(b);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Sample s=new Sample();
		s.display();

	}

}
