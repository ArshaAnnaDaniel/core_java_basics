package interface_eg;

public class Hdfc implements RbiInterface{
	int amount=1000;
	int duration=8;
	public void recurringDeposit() {
		System.out.println("the amount accepted is:"+amount);
		System.out.println("the duration is:"+duration);
	}
	public void interest() {
		int rate_calcu=(20*1000)/100;
		int money_back= (rate_calcu*duration)+amount;
		System.out.println("interest amount for one year: "+rate_calcu);
		System.out.println("money back after deposit period of time: "+money_back);
				
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc n= new Hdfc();
		n.recurringDeposit();
		n.interest();

	}


	}


