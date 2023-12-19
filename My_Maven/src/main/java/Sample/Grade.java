package Sample;

public class Grade {
	int maths;
	int physics;
	int english;
	public Grade(int a,int b,int c)
	{
	maths=a;
	physics=b;
	english=c;
	}
	public int sum()
	{
	int total=maths+physics+english;
	if(total>=90)
	{
		System.out.println("grade A");
	}
	else
	{
		System.out.println("grade B");
	}
	return total;
	}

	public static void main(String[] args) {
		Grade ob=new Grade(10,20,30);
		int c=ob.sum();
		System.out.println("total marks:"+c);
		Grade ob1=new Grade(30,40,10);
		int d=ob1.sum();
		System.out.println("total marks:"+d);
		
		
		

	}

}
