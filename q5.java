import java.util.*;
/*
There are two operations Insert and Delete in the code. For example to Insert y at index x then use:
Insert
x y
Delete the element at x then use:
Delete
x
*/
public class q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<Integer>();
		System.out.print("Enter number of elements in list:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.print("Enter number of queries:");
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++)
		{
			sc.nextLine();
			String v=sc.nextLine();
			if(v.equals("Insert"))
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				l.add(a,b);
			}
			else
			{
				int a=sc.nextInt();
				l.remove(a);
			}


		}
		for(Integer x:l)
			System.out.print(x+" ");

	}
}