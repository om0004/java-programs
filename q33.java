import java.util.*;
/*
Calorie Count
Mostly People love chocolates, but they also have to stay fit. Each chocolate has a calorie count, and People can walk a distance to expend
or burn those calories. If People have eaten k chocolates so far, after eating a chocolates with c calories they must walk minimum (2^k)xc
miles to maintain their weight
For example, if they eat chocolates with calorie counts in any order like [5 10 7],
 the miles they need to walk are ((2^0)x 5 + (2^1)x 10 + (2^2)x7) = 5+20+28 =53. 
This is not the minimum, though, so we need to test other orders of consumption. In this case, our minimum miles is
calculated as ((2^0)x 10 + (2^1)x 7 + (2^2) x 5) = 10+14+20=44.
Input Format
The first line contains an integer n, the number of chocolates in calorie.
The second line contains n space-separated integers calorie[i].
Output Format
Print a long integer denoting the minimum number of miles People must walk to maintain their weight.

*/
public class q33
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,c,j=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			}
	    Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--)
			{
				c=(int)arr[i]*(int)Math.pow(2,j);
				j++;
				sum=sum+c;
			}
			System.out.print(sum);
	}

}