import java.util.*;
class swap
{
	int x;
	swap(int x)
	{
		this.x=x;
	}
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		swap ob1=new swap(10);
		swap ob2=new swap(20);
		System.out.println(ob1.x+" "+ob2.x);
		swapp(ob1);
		System.out.print(ob1.x+" "+ob2.x);




	}
	public static void swapp(swap ob)
	{
		ob.x=20;
		System.out.println(ob.x);
	}
}