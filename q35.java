import java.util.*;
/*
After every six months, the department of an organization to maintain the employees list that contains employees name and salary
increment for their performance and give them feedback so that they can improve. To analyse Department required sorted list either on
base of name or salary increment.
To find the employees’s performance by sorting and display the employees's list. If SalaryIncrementSort is enter then list should be sorted
with salary increment in the descending order and if NameSort is entered as choice, then list should be sorted by name of employees in
alphabetic order. Write a program to complete analysis process.
Input Format
The first line of input will contain numbers of employees, n.
The next lines contain name and of salary increment.
The last line of input contains a choice whether to sort as SalaryIncrementSort or NameSort.
Output Format
Output contains serial no, name and Salary Increment according to sorting choice entered.
*/
class Yo implements Comparable<Yo>
{
	private String a;
	private int b;
	private static int d;
	public Yo(String a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public String getName()
	{
		return this.a;
	} 
	public int getSalary()
	{
		return this.b;
	}
	public String toString()
	{
		return this.a+" "+this.b;
	}
	public static void choice(String s)
	{
		if(s.equals("namesort"))
			d=1;
		else
			d=2;
	}
	public int compareTo(Yo obj)
	{
		if(d==1)
		{
			if(obj.getName().compareTo(this.a)<0)
				return 1;
			else 
				return -1;
	   }
	   else
	   {
	   	if(obj.getSalary()>this.b)
	   		return 1;
	   	else
	   		return -1;

	   }
	   
}
}
public class q35
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=1;
		ArrayList<Yo>list=new ArrayList<Yo>();
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			String a=sc.nextLine();
			int b=sc.nextInt();
			list.add(new Yo(a,b));
		}
		sc.nextLine();
		String c=sc.nextLine();
		Yo.choice(c);
		Collections.sort(list);
		for(Yo y:list)
		{
			System.out.println(j+" "+y);
			j++;
		}
	}
}