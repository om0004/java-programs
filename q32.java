import java.util.*;
/*
Smallest & Largest substring of given length
Arrange the string in lexicographical order which means A<B<…..<a<b (as per ascii range)
for example : apple<bat
A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given string s and integer k, complete the function so that it finds the lexicographical smallest and largest substring of length k.
Input Format
First line contains string s
Second line contains integer k.
Output Format
String should be 1<=s<=1000
It should contain only alphabets like A-Z-a-z
*/
public class q32
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		int z=k,i=0;
		String large=s.substring(0,k);
		String small=s.substring(0,k);
		while(i!=s.length()-k+1)
		{
			if(s.substring(i,z).compareTo(large)>0)
			{
				large=s.substring(i,z);
			}
			if(s.substring(i,z).compareTo(small)<0)
			{
				small=s.substring(i,z);
			}
			i++;
			z++;
		}
		System.out.println(small);
		System.out.print(large);
	    }
}