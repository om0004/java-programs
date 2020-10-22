import java.util.*;
class prime2
{
	public static void main(String args[])
	{
		int b,c,i,d;
		Scanner a=new Scanner(System.in);
		prime2 ob=new prime2();
		System.out.print("enter first number:");
		b=a.nextInt();
		System.out.print("enter second number:");
		c=a.nextInt();
		for(i=b;i<c;i++)
		{
			d=ob.check(i);
			if(d==1)
			{
				System.out.println(i);
			}
		}
		
	}
	int check(int a)
	{
		int i;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				return 0;
			}
		}
		if(i==a)
		{
			return 1;
		}
		return 0;
	}
}