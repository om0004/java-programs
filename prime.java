import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int i;
		Scanner a=new Scanner(System.in);
		System.out.print("enter a number:");
		int b=a.nextInt();
		for(i=2;i<b;i++)
		{
			if(b%i==0)
			{
				System.out.println("Not prime");
				break;
			}
		}
		if(b==i)
		{
			System.out.print("prime!");
		}
	}
}