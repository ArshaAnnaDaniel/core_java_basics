package collection_eg;

import java.util.ArrayList;
import java.util.List;

public class Sample_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arraylist1=new ArrayList(); //NON generic array list
		//System.out.println(arraylist1);
		arraylist1.add(10);
		arraylist1.add("arsha");
		arraylist1.add(15.5);
		System.out.println(arraylist1);
		ArrayList<Integer> arraylist2 = new <Integer>ArrayList(); //non primitive datatype  <generic arraylist
		arraylist2.add(10);
		arraylist2.add(20);
		arraylist2.add(30);
		arraylist2.add(80); //only specific datatype that mentioned
		System.out.println(arraylist2);
		
		List<String> list1=new <String>ArrayList();  //list interface
		list1.add("arsha");
		list1.add("anna");
		list1.add("daniel");
		list1.add(" ");
		System.out.println(list1);  //can add multiple null value
		
		list1.remove(1);   //to remove an elemant
		System.out.println(list1);
		
		//int size= list1.size();  // to get the size of our list
		System.out.println(list1.size());
		
		List<String> list3 = new <String>ArrayList();
		list3.addAll(list1);  //for adding to other list
		System.out.println(list3);
		
		list1.removeAll(list1);  //remove all items at a time
		System.out.println(list1);
		
		boolean s=list3.contains("tea");  //checking the objects in the list
		System.out.println(s);
		
		list3.add("tea");
		System.out.println(list3);
		
		String d=list3.get(1);  //to get objects from specified positions
		System.out.println(d);
		

	}

}
