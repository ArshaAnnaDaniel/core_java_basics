package Sample;

public class Add_instance {
	public void  add(int a,int b) {
		
		int sum=a+b;
		System.out.println("sum is:"+sum);
		
	}
	
	
	

	public static void main(String[] args) {
	Add_instance ob=new Add_instance();
	ob.add(5, 10);
	

	}

}
