package Sample;

public class Sub_Mul {
	int a,b;  
	public Sub_Mul(int a,int b)   
	{
	this.a=a;
	this.b=b;  
	}
	public void  sub() {
		this.mul();
		int sub=a-b;
		System.out.println("sub is:"+sub);
		}
	public void mul() {
		int mul=a*b;
		System.out.println("mul is:"+mul);
	}

	public static void main(String[] args) {
	Sub_Mul ob=new Sub_Mul(10,5);
	ob.sub();

	}

}
