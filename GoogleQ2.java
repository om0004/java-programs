import java.util.*;
/*
Given an array of integers, return a new array such that each element at 
index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/
public class GoogleQ2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        int pr=1,j=0;
        left[0]=1;
        right[n-1]=1;
        for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        for(int i=1;i<n;i++)
        {
            pr=arr[j];
            left[i]=left[j]*pr;  
            j++;
        }
        j=n-1;
        for(int i=n-2;i>=0;i--)
        {
        	pr=arr[j];
        	right[i]=right[j]*pr;
        	j--;
        }
       for(int i=0;i<n;i++)
       {
       	arr[i]=left[i]*right[i];
       }
for(int k:arr)
	System.out.print(k+" ");


    }
}