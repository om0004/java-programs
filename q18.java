import java.util.*;
/*
Password technique
A technique used for password generation for a particular person involves
first two letters of first name
last two letters of last name
if midddle name is of odd length then middle letter of middle name
But if middle name is of even length then middle two letters of middle name. sum their ascii values. Divide by 2 and
character correspond to the resultant ascii value .
*/
public class q18
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first name:");
		String a=sc.nextLine();
		System.out.print("enter middle name:");
		String b=sc.nextLine();
		System.out.print("enter last name:");
		String c=sc.nextLine();
		String d="";
		int e=b.length();
		if(e%2==1)
		{
			d=b.substring(e/2,(e/2)+1);
		}
		else
		{
			e--;
			int g=((int)b.charAt(e/2)+(int)b.charAt((e/2)+1))/2;
			d=String.valueOf((char)g);
		}
        System.out.print(a.substring(0,2)+d+c.substring(c.length()-2));


	}

}