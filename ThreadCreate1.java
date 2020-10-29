class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName()+":"+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName()+":"+i);
		}
	}
}
public class ThreadCreate1
{
	static public void main(String args[])
	{
		A obj=new A();
		B obj1=new B();
		obj.start();
		obj1.start();

	}

}