package assignment;

public class Encapsulation_class_1 {
	private int pin;
	public void setter(int n)
	{
		pin=n;
	}
	public void getter() {
		
		if(pin==1001||pin==1234||pin==1212)
		{
			System.out.println("withdraw the cash");
		}
		else {
			System.out.println("User is invalid");
		}
		
		
		
	}
	

}
