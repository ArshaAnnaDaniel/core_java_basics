package collection_eg;

import java.util.ArrayList;

public class Vegetable {
	public static ArrayList<String> addVegetable()
	{
		ArrayList<String> items= new <String>ArrayList();
		items.add("carrot");
		items.add("cucumber");
		items.add("beans");
		items.add("tomato");
		
		
		return(items);
		
	}

	public static void main(String[] args) {
		ArrayList<String> veggies=addVegetable();
	   // Vegetable.addVegetable();
	    
	    System.out.println(veggies);
		

	}

}
