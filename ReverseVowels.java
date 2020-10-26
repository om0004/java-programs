import java.util.*;
class ReverseVowels
{
	char[] arr2=new char[50];
	char[] arr3=new char[50];
public static void main(String args[])
{
	Scanner a=new Scanner(System.in);
	StringBuffer sb=new StringBuffer();
	System.out.print("Enter String:");
	sb.append(a.nextLine());
	ReverseVowels obj=new ReverseVowels();
	obj.end(sb);
	obj.check(sb);
}
public void end(StringBuffer sb)
{
	int i,j=0;
	sb.reverse();
	for(i=0;i<sb.length();i++)
	{
		if(sb.charAt(i)=='a'||sb.charAt(i)=='i'||sb.charAt(i)=='e'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
		{
			arr2[j]=sb.charAt(i);
			j++;
		}
	}
	sb.reverse();
} 
public void check(StringBuffer sb)
{
	int i,j=0,k=0;
	for(i=0;i<sb.length();i++)
	{
		if(sb.charAt(i)=='a'||sb.charAt(i)=='i'||sb.charAt(i)=='e'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
		{
			arr3[j]=arr2[k];
			k++;
			j++;
		}
		else
		{
			arr3[j]=sb.charAt(i);
			j++;
		}
	}
	for(i=0;i<j;i++)
	System.out.print(arr3[i]+" ");
}
}