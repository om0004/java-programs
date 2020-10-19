interface one
{
	public void geek();
}
interface two
{
	public void forr();
}
interface three extends one,two
{
}
class child implements three 
{
	public void geek()
	{
		System.out.println("geeks");
	}
	public void forr()
	{
		System.out.println("for");
	}
}
public class Multipleinheritence
{
	public static void main(String args[])
	{
		child obj=new child();
		obj.geek();
		obj.forr();
		obj.geek();
	}
}