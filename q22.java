import java.util.*;
/*
  In search of smallest and second smallest if any
Suppose you are given with an array. The objective of this challenge is to find the smallest and second smallest
integer present in the array. The job doesn’t not end here, you as a coder must take care of following conditions:
1.     If the user inputs a negative number print invalid input
2.     If size of array entered by user is less than 2 then print array size less than 2
3.     If array consists of all duplicate elements e.g. [2,2,2,2,2} . In such cases print “no second smallest element
4.     Else print the smallest element is - and the second smallest element is-

*/
public class q22
{
	public static void main(String args[]) throws Exception
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int count=0,small=999,second=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int f=arr[0];
	try
	{
	for(int i:arr)
		if(i<0)
			throw new Exception("invalid input");
	if(n<2)
		throw new Exception("Size less than 2");
	for(int i:arr)
		if(i==f)
			count++;
	if(count==n)
			throw new Exception("no second smallest element!");
	for(int i=0;i<n;i++)
	{
		if(arr[i]<small)
		{
			second=small;
			small=arr[i];
		}
		else if(arr[i]>small&&arr[i]<second)
			{
				second=arr[i];
			}

	}
	System.out.println("smallest:"+small+"\nsecond smallest:"+second);	

}
	catch(Exception e)
	{
		System.out.print(e.getMessage());
		System.exit(0);
	}
}
}