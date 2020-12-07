import java.util.*;
/*
Sliding Window Maximum
Rohan is a computer science student and his teacher give him a question:
Given an array nums, and with this there is a sliding window of size k which is moving from the very left of the array to the very right. 
You can only see the k numbers in the window. Each time the sliding window moves right by one position. This window return the max number.
Input Format
First line contain the size of array
Next n lines contain elements of array
Last line store the size of k

*/
public class q29
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0,large=0,t=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		 while(j<n)
		 {
		 	large=arr[t];
		 	j=t;
		 	for(int i=0;i<k;i++)
		 	{
		 		if(arr[j]>large)
		 		{
		 			large=arr[j];
		 		}
		 		j++;
		 	}
		 	System.out.println(large);
		 	t++;
		 }

	}
}