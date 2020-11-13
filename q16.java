import java.util.*;
/*
Sort string
keshav had learned alphabets precedence few days back and have been assigned task to arrange letters of a string as
per ascending order. Help keshav to complete the task.

*/
public class q16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		char arr[]=n.toCharArray();
		Arrays.sort(arr);
		String b=String.valueOf(arr);
		b=b.trim();
		System.out.print(b);

	}
}
