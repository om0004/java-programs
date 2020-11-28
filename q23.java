import java.util.*;
/*
specifications of that number is that it consists of the first 3 alphabets of the name of contender followed by
registration number of the contender followed by first 3 alphabets of the city contender belongs to. Develop a system
to generate number plate for each contender using the contender's details.
first line specifies number of racing cars(n)
next
3n lines specifies name of nth
contestant, registration number and city he belongs to
*/
class Output
{
	String name;
	String number;
	String city;
	public Output(String name,String number,String city)
	{
		this.name=name;
		this.number=number;
		this.city=city;
	}
	public String toString()
	{
		String d=name.substring(0,3)+number.substring(0,3)+city.substring(0,3);
		return d;
	}
}
public class q23
{
	public static void main(String args[])
	{
		ArrayList<Output> l=new ArrayList<Output>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=sc.nextLine();
			String city=sc.nextLine();
			String number=sc.nextLine();
			l.add(new Output(name,number,city));
		}
		for(Output obj:l)
		{
			System.out.println(obj);		}
	}
}