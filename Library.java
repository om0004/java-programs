//import java.util.*;	
//public class Stu
class Stu
{
	Scanner a=new Scanner(System.in);
	String name;
	String roll;
	String f_name;
	//public void get()
	void get()
	{
		System.out.print("enter name:");
		name=a.nextLine();
		System.out.print("enter father's name:");
		f_name=a.nextLine();
		System.out.print("enter roll number:");
		roll=a.next();
	}
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("fathers name:"+f_name);
		System.out.println("roll number:"+roll);
	}
	/*
	public static void greet()
	{
		System.out.println("hello "+name);
	}
	*/
}
public class Library
{
	Scanner a=new Scanner(System.in);
	String book_name;
	int book_price;
	int bookid;
public void get()
{
	    System.out.print("enter book name:");
		book_name=a.nextLine();
		System.out.print("enter book price:");
		book_price=a.nextInt();
		System.out.print("enter book id:");
		bookid=a.nextInt();
}
public void display()
{
	    System.out.println("book name:"+book_name);
		System.out.println("book price:"+book_price);
		System.out.println("book id:"+bookid);

}
public static void welcome()
{
	System.out.println("welcome to library!!");
} 
	static public void main(String args[])
	{
		Stu obj1=new Stu();
		Library obj2=new Library();
		//greet();
		welcome();
		obj1.get();
		obj1.display();
		obj2.get();
		obj2.display();
		

	}
}