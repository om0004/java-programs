import java.util.*;
/*
Compute the power of a number, create a class PowerOfNumber which consists of a single method "int calPower (int
n,int p)". This method takes two integers, n and p, as parameters and nds the power. If either n or p is negative, then the
method must throw an exception which says "n or p should be non-negative". Also, if either n or p is zero, then the method
must throw an exception which says "n or p should be non-zero". Otherwise calculate the power (np
) and return the same.
Complete the function calPower in class PowerOfNumber and return the appropriate result after the power operation or
an appropriate exception as detailed above.
*/

class exc extends RuntimeException
{
	public exc(String msg)
	{
		super(msg);
	}
}
public class q3
{
	static String s="";
	public static void calPow(int a,int b)
	{
		int pr=1;
		if(a==0||b==0)
			throw new exc("number cant be zero!");
		else if(a<0||b<0)
			throw new exc("number can't be negative!");
		else
		{
			for(int i=0;i<b;i++)
				pr=pr*a;
			s=s+pr+"\n";
			
		}

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter number:");
			int a=sc.nextInt();
			System.out.print("Enter power:");
			int b=sc.nextInt();
			try
			{
			calPow(a,b);
		}
		catch(exc e)
		{
		s=s+e.getMessage()+"\n";	
		}
		}
		System.out.print(s);

	}
}