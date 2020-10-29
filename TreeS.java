import java.util.*;
class Book
{   private String name;
	private int price;
	public Book(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getName()
	{
		return this.name;
	}


}

class Comp implements Comparator
{
	public int compare(Object o1,Object o2)
{
	Book book1=(Book)o1;
	Book book2=(Book)o2;
	if(book1.getPrice()>book2.getPrice())
		return 1;
	else
		return -1;
}
}
public class TreeS
{
	public static void main(String args[])
	{
		Book b1=new Book("c",500);
		Book b2=new Book("java",100);
		Book b3=new Book("python",400);
		Book b4;
		TreeSet<Book>obj=new TreeSet<Book>(new Comp());
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			b4=(Book)it.next();
			System.out.println("name:"+b4.getName()+" price:"+b4.getPrice());
		}
	}
}