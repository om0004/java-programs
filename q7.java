import java.util.*;
/*
You are supposed to enter two variables x and y and compute x/y. Along with this your program must be able to handle
two situations as desired:
If x<y then an exception must be thrown with message:
java.lang.Exception: Numerator should be larger
If y=0 then an exception must be thrown with message:
java.lang.Exception: Denominator should not be zero
Else it should print x/y.
*/
public class q7
{
	public static void main(String args[]) throws Exception
	{
		try{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(b==0)
		{
			throw new Exception("Denominator cant be zero");
		}
		if(a<b)
		{
			throw new Exception("Denominator should be greater than 0");
		}
		int c=a/b;
		System.out.print(c);

}
catch(Exception e)
{
	System.out.print(e);
}

	}

}