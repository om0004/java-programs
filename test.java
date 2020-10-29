class ab
{
	ab(int x)
	{
		System.out.print("parent class constructor");
	}
}
class test extends ab
{
	test(int x)
	{
		super(10);
		System.out.print("child class constructor");
	}
	public static void main(String args[])
	{
		test ob=new test(10);
	}
}