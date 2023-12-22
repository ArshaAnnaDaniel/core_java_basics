package assignment;

public class Polymorphism_offseason extends Polymorphism_onseason {
	public void discount(int n) {
		int disc=(15*n)/100;
		int amount=n-disc;
		System.out.println("the Off discount amount is: "+amount);
		super.discount(3000);
		
	}


	public static void main(String[] args) {
		
				Polymorphism_offseason n= new Polymorphism_offseason();
			     n.discount(3000);


	}

}
