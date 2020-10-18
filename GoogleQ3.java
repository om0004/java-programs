import java.util.*;
/*
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
*/
public class GoogleQ3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int index=0,i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				index=i;
				break;
			}
		}
		i=1;
		for(int j=index;j<n;j++)
		{
			if(arr[j]==i)
			{
				i++;
			}
			else
			{}
		}
		System.out.print(i);
	}
} 