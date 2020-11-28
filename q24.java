import java.util.*;
/*
You are supposed to read an array from console and then to print true if the sum of 10s in the array is 30 else print
*/
public class q24
{
public static Boolean check(int[] arr)
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==10)
		{
			count=count+10;
		}
		if(count==30)
			return true;

	}
	return false;
}	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.print(check(arr));
}
}