import java.util.*;
class palindrome
{
	static public void main(String args[])
	{
		int c,rev=0;
		Scanner a=new Scanner(System.in);
		System.out.print("enter number:");
		int b=a.nextInt();
		c=b;
		while(b>0)
		{
			rev=rev*10+b%10;
			b=b/10;
		}
		if(rev==c)
			System.out.print("palindrome!!");
		else
			System.out.print("nah!");
	}
}