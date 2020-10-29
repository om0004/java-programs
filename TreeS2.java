import java.util.*;
class Bookk implements Comparable<Bookk>
{
private int id;
private String name;
public Bookk(int id,String name)
{
	this.id=id;
	this.name=name;
}
public int getId()
{
	return this.id;
}
public String getName()
{
	return this.name;
}
public int compareTo(Bookk b)
{
	if(b.getId()<this.id)
		return 1;
	else
		return -1;

}
}
public class TreeS2
{
	public static void main(String args[])
	{
		Bookk b1=new Bookk(100,"reema");
		Bookk b2=new Bookk(50,"cat");
		Bookk b3=new Bookk(10,"dog");
		Bookk b4;
		TreeSet<Bookk>obj=new TreeSet<Bookk>();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			b4=(Bookk)it.next();
			System.out.println(b4.getId()+"  "+b4.getName());
		}
	}
}
