package collection_eg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> arraylist1= new <Integer>ArrayList();
		arraylist1.add(10);
		arraylist1.add(20);
		arraylist1.add(70);
		arraylist1.add(2);
		System.out.println(arraylist1);
		
		
		ArrayList<Integer> arraylist2=  new <Integer>ArrayList();   //nonprimitive datatypes(Generic array list created)
		arraylist2.add(34);
		arraylist2.add(45);
		arraylist2.add(56);//only specific data types that mentioned
		System.out.println(arraylist2);
		
		arraylist1.remove(1);//for removing one object
		System.out.println(arraylist1);
		//int size=list1.size();
		System.out.println(arraylist1.size());
		
		ArrayList<Integer> arraylist3= new <Integer>ArrayList();
		arraylist3.addAll(arraylist1);//for adding to other list
		System.out.println(arraylist3);
		
		arraylist1.removeAll(arraylist1);// for removing all objects at a time
		System.out.println(arraylist1);
		
		boolean s=arraylist3.contains("2");// checking the objects in the list
		System.out.println(s);
		
		arraylist3.add(78);
		System.out.println(arraylist3);
		int d =arraylist3.get(2);// to get object from particular position
		System.out.println(d);
		
		Iterator itr= arraylist2.iterator(); //iterator interface
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(arraylist2); //to remove last object from the list
		
		

	}





	}


