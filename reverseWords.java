import java.util.*;
class ReverseWords
{
	static void reverse(String st)
	{
		String token[]=st.split("\\s");
		String dog="";
		for(int i=0;i<token.length;i++)
		{
		StringBuffer b = new StringBuffer(token[i]);
		b.reverse();
		dog=dog+b+" ";
		}
System.out.print(dog);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		reverse(sc.nextLine());
	}
}