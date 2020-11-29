import java.util.*;
/*
Sachin is solving a very interesting challenge. The goal is to replace every element of the array with the next greatest
element present in the right sub array.
For example:
The arrays is [22,11,99,1]
So the output must be [99,99,1,-1]
Explanation:
To begin with, consider the first element 22 and the sub array to the right side of 22 is [11,99,1} so the greatest
element is 99 hence 22 is replaced by 99 int the final array.
Similarly, for 11 the subarray to the right side of 11 is [99,1}, and the greatest element which will replace 11 is again
99.
Similarly for 99, it is replaced by 1,only greatest element.
The rule is to keep the last element of the output array as -1 always.
Join Sachin in solving this challenge.
*/
public class q26
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer arr[]=new Integer[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
         arr[i]=0;
         arr2[i]=Collections.max(Arrays.asList(arr));
		}
		arr2[n-1]=-1;

		
		for(int i:arr2)
			System.out.print(i+" ");
			

	}

}