import java.util.*;	
class reversen
{
	public static void main(String args[])
	{
		int rev=0,rem,b;
		Scanner a=new Scanner(System.in);
		System.out.print("enter a number:");
		b=a.nextInt();
		while(b>0)
		{
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
		System.out.print(rev);
	}
}