import java.util.*;
class perfectnumber
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.print("enter number:");
		int n=a.nextInt();
		int i,sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			System.out.print("perfect number!");
		else
			System.out.print("nah!!");
	}
}