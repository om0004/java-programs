import java.util.*;
/*
Count substrings
Given a string S consisting of only 1s and 0s, find the number of substrings which start and end both in 1.
In this problem, a substring is defined as a sequence of continuous characters Si
, Si+1
, ..., Sj
 where 1 ≤ i ≤ j ≤ N.

*/
public class q17
{
	public static void main(String args[])
	{
		int count=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of test cases:");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter String:");
			String a=sc.nextLine();
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)=='1')
				{
					count++;
					sum=sum+count;
				}
			}
			System.out.println(sum);
			count=0;
			sum=0;
		}


	}
}