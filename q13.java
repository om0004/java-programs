import java.util.*;
/*
Create a class MyPassword which consists of a single method checkPassword(String). This method takes one String s as parameter and
finds if password is strong or not
Password’s first character must be in capital.
Fifth character must be special character.
If first charcter is not capital, then the method must throw an exception which says First character should be in capital
Also if fifth
character is not special character then the method must throw an exception, which says Fifth character should be special character
*/
class MyPassword
{
	public void checkPassword(String pass) throws Exception
	{
		if(pass.charAt(0)>='A'&&pass.charAt(0)<='Z')
		{
			if(pass.charAt(4)=='@'||pass.charAt(4)=='$')
			{
				System.out.print("Strong password");
			}
			else
				throw new Exception("fifth character should be special character");


		}
		else
			throw new Exception("First character should be capital");

	}
}
public class q13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        MyPassword obj=new MyPassword();
        String username=sc.next();
        String password=sc.next();
        try{
        obj.checkPassword(password);
           }
        catch(Exception e){
        System.out.println(e.getMessage());
	}
}
}