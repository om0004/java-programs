import java.util.*;
/*
Write a Java program to find the second most frequent character in a given string. 
*/
public class q19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		int temp[]=new int[256];
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			temp[arr[i]]=temp[arr[i]]+1;
		}
		int large=temp[arr[0]],second=0,c=0,b=0;
		char z=arr[0];
		for(int i=0;i<s.length();i++)
		{
			if(temp[arr[i]]>0)
			{
				System.out.println(arr[i]+":"+temp[arr[i]]);
				if(temp[arr[i]]>large)
				{
					c++;
					second=large;
					large=temp[arr[i]];
				}
				else if(temp[arr[i]]!=large&&temp[arr[i]]>second)
				{
					b++;
					second=temp[arr[i]];
					z=arr[i];
				}
				temp[arr[i]]=0;
			}
		}
		if(c>0||b>0)
		System.out.print("second largest is:"+z);
	    else
	{
		System.out.print("NO");
	}
	
}
}