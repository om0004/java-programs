import java.util.regex.*;
import java.util.*;
public class regexx
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.print(Pattern.matches("\\w+\\d+\\@\\w+\\.\\w{2,10}\\.*\\w*",s));
		Pattern p=Pattern.compile("\\w+\\d+\\@\\w+\\.\\w{2,10}\\.*\\w*");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.print(m.group()+" ");
		}
		System.out.print(m.groupCount());


	}

}