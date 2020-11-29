import java.util.*;
/*
Mr. Jeetu has given an assignment for 10 credits. The problem of this assignment is to print those pairs from the array
which have sum equal to 20. Let us solve this problem to get full credits.
For example ,let the array is:
{10,5,15,16,4}
so the pairs with sum=20 are
{5,15} and {16,4}
*/
public class q25
{
	public static void check(int []arr)
	{
		int n=20;
		HashSet<Integer>set=new HashSet<Integer>();	
		set.add(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			if(set.contains(n-arr[i]))
			{
				System.out.println(n-arr[i]+"+"+arr[i]+"=20");
				set.add(arr[i]);
			}
			else
			{
				set.add(arr[i]);
			}

		}

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Pair of elemets and their sum:");
		check(arr);
	}
}