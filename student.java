
import java.util.*;
class student
{
	Scanner a=new Scanner(System.in);
	String name;
	String f_name;
	String roll;
	String mobile;
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("fathers name:"+f_name);
		System.out.println("roll number:"+roll);
		System.out.println("mobile number:"+mobile);
	}
	void read()
	{
		System.out.print("enter name:");
		name=a.next();
		System.out.print("enter father's name:");
		f_name=a.next();
		System.out.print("enter roll number:");
		roll=a.next();
		System.out.print("enter mobile number:");
		mobile=a.next();
	}
	public static void main(String args[])
	{
		student obj1=new student();
		student obj2=new student();
		obj1.read();
		obj1.display();
		obj2.read();
		obj2.display();
	}
}