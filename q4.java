import java.util.*;
/*
You have to search an element at a given position in a list. For that You have been given lines. In each line there are zero
or more integers. You need to answer a query where you need to tell the number located in position of line.
*/
public class q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of lists:");
		int n=sc.nextInt();
		ArrayList<ArrayList> d=new ArrayList<ArrayList>();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter number of elements in list "+i+":");
			int a=sc.nextInt();
			ArrayList<Integer>l=new ArrayList<Integer>();
			for(int j=0;j<a;j++)
			{
				l.add(sc.nextInt());
			}
			d.add(l);
		}
		
		System.out.print("Enter list number:");
		int z=sc.nextInt();
		System.out.print("Enter position:");
		int pos=sc.nextInt();
		z--;
		pos--;
		if(z<d.size()&&pos<d.get(pos).size())
			System.out.print(d.get(z).get(pos));
		else
			System.out.print("could not find!");

	}
}