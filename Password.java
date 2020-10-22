import java.util.Scanner;
import java.util.regex.*;
// Other imports go here
// Do NOT change the class name
class Password
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    String passwordd=sc.nextLine();
    try
    {
      if(passwordd.length()<6)
      {
        throw new Abc("Too short!");
      }
      if(Pattern.matches("[0-9]",passwordd))
      {

      }
      else
      {
        throw new Abc("No digit!");
      }
    }
    catch(Abc e)
    {
      System.out.print(e.getMessage());
    }
  }
}
class Abc extends Exception
{
public Abc(String msg)
{
super(msg);
}
}