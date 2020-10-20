import java.util.*;
class A
{
	public static void pp()
	{
		System.out.print("Hello A");
	}

}
class B extends A
{
	
}
public class override
{
	public static void main(String args[])
	{
		B b=new B();
	    super.pp();
	}
}