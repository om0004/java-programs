import java.util.*;
class sumofdigits
{
public static void main(String rgs[])
{
	Scanner a=new Scanner(System.in);
	int n=a.nextInt();
	int sum=0;
	while(n>0)
	{
		sum=sum+n%10;
		n=n/10;
	}
	System.out.print(sum);
}
}