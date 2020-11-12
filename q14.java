import java.util.*;
import java.util.regex.*;
/*
username:
The size should be between 6 to 12 and otherwise system generates an exception with message:
The length of username should be between 6 and 12 otherwise, print Username accepted
password:
Size should be between 6 and 12 otherwise generates an exception with message:
Invalid Size Exception : length should be between 6 to 12
Password should start with Capital Letter otherwise it will give an exception with message:
Invalid Start of Password : First Letter should be capital
It should not start with special characters including '!', '@', #', '$', '%', '^', '&', '*', '-', '_' otherwise throws 
exception with message:Invalid Start of Password : Can't start with special character
It should not start with digit if it is then throws exception with message:
Invalid Start of Password : Can't start with digit
If password is valid then print:
Password accepted
*/
class except extends RuntimeException
{
except(String msg)
{
	super(msg);
}
}
public class q14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter username:");
		String a=sc.nextLine();
		System.out.print("Enter password:");
		String b=sc.nextLine();
		try
		{
			if(a.length()>=6&&a.length()<=12)
				System.out.println("Username accpeted!");
			else throw new except("length of username should be be between 6 and 12"+"\n");

		}
		catch(except e)
		{
			System.out.print(e.getMessage());
		}
		try
		{
			if(b.length()>=6&&b.length()<=12)
			{}
			else throw new except("Invalid Size Exception : length should be between 6 to 12");
			if(Pattern.matches("[A-Z]\\w+",b))
				System.out.print("Correct password!");
			if(Pattern.matches("[a-z]\\w+",b))
			{
				throw new except("Invalid Start of Password : First Letter should be capital");
			}
		    if(Pattern.matches("\\d\\w+",b))
		    {
		    	throw new except("Invalid Start of Password : Can't start with digit");
		    }
		    if(Pattern.matches("[!@#$%^&*-_]\\w+",b))
		    {
		    	throw new except(":Invalid Start of Password : Can't start with special character");
		    }
		}
		catch(except e)
		{
			System.out.print(e.getMessage());
		}


	}
}