import java.util.*;
public class LinkedListt
{
	public static void main(String args[])
	{
	LinkedList <String> obj=new LinkedList<String>();
	obj.add("ram");
	obj.add("shyam");
	obj.add("ram");
	obj.add("dog");
for(int i=0;i<obj.size();i++)
{
obj.remove("ram");
}
System.out.println(obj);
}
}