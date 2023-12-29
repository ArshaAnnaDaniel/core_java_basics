package exception_eg;

public class Test {
	public void display()
	{
		int a=10;
		try {
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e) //class name object name
		{
			//System.out.println(e);
			e.printStackTrace();  //to print the exception trace
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test s=new Test();
		//System.out.println("end of the statement");
		
		s.display();  //execute still exception
		System.out.println("end of the statement");
				
				}

	}


