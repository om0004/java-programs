import java.util.*;
/*
You are given two integers X and Y as input, you have to compute X/Y . If X and Y are not same type of inputs or if Y is
zero, exception will be thrown and you have to report it.
Read sample Input/Output to know what to report in case of exception.
*/
public class q6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int d=a/b;
			System.out.print(d);
		}
		catch(Exception e)
		{

			System.out.print(e);
		}

	}
}