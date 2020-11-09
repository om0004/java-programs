import java.util.*;
/*
Write a program to get the input from user that is user name and password.
If the password enter by user has less than 8 characters then throw an exception with message :UserName: Too short
password!
If the password enter by user does not contain a digit then throw an exception with message : UserName: No digit!
For valid password print UserName: Correct password
*/
public class q9
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		String user=sc.nextLine();
		String pass=sc.nextLine();
		int count=0;
		if(pass.length()<8)
			throw new Exception(user+": Too short password!");
		for(int i=0;i<pass.length();i++)
		{
			if(pass.charAt(i)>='0'&&pass.charAt(i)<='9')
			{
				System.out.print("Correct password");
				count=1;
				break;
			}
		}
		if(count==0)
			throw new Exception(user+": no digit!");
			
	}
	catch(Exception e)
	{
		System.out.print(e.getMessage());
	}

	}
}