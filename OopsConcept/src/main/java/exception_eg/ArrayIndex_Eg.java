package exception_eg;

public class ArrayIndex_Eg {
	public void display()
	{
		int number[]= {3,5,8};
		int index=4;
		try {
		int value=number[index];
		System.out.println(value);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		ArrayIndex_Eg s=new ArrayIndex_Eg();
		s.display();
		System.out.println("this is exception");

	}

}
