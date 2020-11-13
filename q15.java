import java.util.*;
/*
Write the java program to sort the data present in the LinkedList using Comparator Interface.
A class Library is given to you with some data members. This class consists a parameterized constructor 
which will initialize the data members of the Library class.
Create another class named SortByAvailabilty which implements the comparator Interface. This class consists of two functions
compare function: This function will compare the two objects of Library class depending upon the availability of the books
(Books that are available in the library will be displayed first)
main function: This function will take inputs from the user and create a linked list.
Note: If more than one book have same availability then they are sorted in the same order as they are inserted
*/
class Details implements Comparable<Details>
{
	private int id;
	private String book;
	private String author;
	private String availability;
	public Details(int id,String book,String author,String availability)
	{
		this.id=id;
		this.book=book;
		this.author=author;
		this.availability=availability;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return book;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getAvail()
	{
		return availability;
	}
	public int compareTo(Details s)
	{
		if(s.getAvail().compareTo(this.availability)==0)
		{
			if(s.getId()<this.id)
				return 1;
			else
				return -1;
		}
		if(s.getAvail().compareTo(this.availability)>0)
	{
		return 1;
	}
		else 
		return -1;
	}

}
public class q15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Details>list=new ArrayList<Details>();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter book id:");
			int a=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name of book:");
			String b=sc.nextLine();
			System.out.print("Enter author name:");
			String c=sc.nextLine();
			System.out.print("Is the book available?:");
			String d=sc.nextLine();
			list.add(new Details(a,b,c,d));
		}
		Collections.sort(list);
		for(Details x:list)
		{
			System.out.println(x.getId()+" "+x.getName()+" "+x.getAuthor()+" "+x.getAvail());
		}

	}
}