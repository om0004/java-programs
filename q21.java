import java.util.*;
/*
 A company Soccer Fans pvt limited (SFPL) develops a system to
provide their customer an option to view sorted list of players according to criteria in which customer can choose the
performance of player at any position. If no criteria is chosen print in sorting order of their name Positions are widely
categorized in 4 i.e. defender,striker,goalkeeper and winger. To implement this system SFPL collaborate with NSPRF
for accessing the database of top soccer players. Players are given stars for their performance. For best performer 5
stars are allocated and for worst its zero
first line consist of number of soccer players(n)
next 2n lines contains name and 4 integers separated by single space specifying name of nth player and 4 integer specifies star
provided to that player as defender, striker,goalkeeper and winger respectively.
next line contains a string specifying choice of sorting criteria
*/
class Soccer implements Comparable<Soccer>
{
	private int arr[]=new int[4];
	private String name;
	private static int d;
	public Soccer(String name,int[] arr)
	{
		this.arr=arr;
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public int[] getArray()
	{
		return this.arr;
	}
	public String toString()
	{
		return getName(); 
	}
public static void condition(String choice)
{
	if(choice.equals("striker"))
	{
		d=1;
	}
	else if(choice.equals("defender"))
	{
		d=0;
	}
	else if(choice.equals("goalkeeper"))
	{
		d=2;
	}
	else if(choice.equals("winger"))
	{
		d=3;
	}
	else
		d=4;
}
public int compareTo(Soccer obj)
{
	if(d<4)
	{
		if(obj.getArray()[d]>this.getArray()[d])
			return 1;
		else
			return -1;
	}
	else
	{
		if(obj.getName().compareTo(this.getName())<0)
			return 1;
		else
			return -1;
	}
}
}
public class q21
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Soccer> l=new ArrayList<Soccer>();
	for(int i=0;i<n;i++)
	{
		sc.nextLine();
		int arr[]=new int[4];
		String name=sc.nextLine();
		for(int j=0;j<4;j++)
		{
			arr[j]=sc.nextInt();
		}
		l.add(new Soccer(name,arr));
	}
	sc.nextLine();
	String choice=sc.nextLine();
Soccer.condition(choice);
Collections.sort(l);
	for(Soccer obj:l)
		System.out.println(obj);
}
}