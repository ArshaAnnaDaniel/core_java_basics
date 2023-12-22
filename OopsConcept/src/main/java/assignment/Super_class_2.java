package assignment;

public class Super_class_2 extends Super_class_1 {
	protected int add(int a,int b) {
		int sum=super.add(a, b);
	
	if(sum%10==0)
	{
		System.out.println("this is divisible by 10");
	}
	else
	{
		System.out.println("this is not divisible by 10");
	}
	return sum;
	}
     
     
	public static void main(String[] args) {
		Super_class_2 ob=new Super_class_2();
		int sum =ob.add(10,20);
		System.out.println("result is:"+sum);
		
	}

}
