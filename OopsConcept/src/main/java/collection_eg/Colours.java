package collection_eg;

import java.util.ArrayList;
import java.util.Iterator;

public class Colours {

	public static void main(String[] args) {
		ArrayList<String> colors=new <String>ArrayList();
		colors.add("blue");
		colors.add("black");
		colors.add("violet");
		colors.add("lavender");
		colors.add("yellow");
		colors.add("red");
		System.out.println(colors);
		
		String a=colors.get(1);  //to get objects from specified positions
		System.out.println(a);
		
		colors.remove(3);   //to remove an elemant
		System.out.println(colors);
		
		boolean s=colors.contains("violet");  //checking the objects in the list
		System.out.println(s);
		
		Iterator itr= colors.iterator(); //iterator interface
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
