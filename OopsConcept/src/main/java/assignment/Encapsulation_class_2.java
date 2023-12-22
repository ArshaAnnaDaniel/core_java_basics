package assignment;
import java.util.Scanner;


public class Encapsulation_class_2 extends Encapsulation_class_1{
	int a;

		
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.print("Enter the PIN number:");
			int a=s.nextInt();
			Encapsulation_class_1 ob= new Encapsulation_class_1();
			ob.setter(a);
			ob.getter();
			

		}


	}


