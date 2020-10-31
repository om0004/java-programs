import java.util.*;
class YoungAgeException extends RuntimeException
{
	YoungAgeException(String msg)
	{
		super(msg);
	}
}
class VotingException
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter age:");
		int z=a.nextInt();
		try
		{
			if(z<18)
			{
				throw new YoungAgeException("sorry! cant vote");
			}
			else
			{
				System.out.println("Thank you");
			}
		}
		catch(YoungAgeException e)
		{
			System.out.print(e.getMessage());

		}
	}
}