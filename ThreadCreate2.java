class A implements Runnable
{
	String name;
	public A(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(name+":"+i);
		}
	}
}
class B implements Runnable
{
	String name;
	public B(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(name+":"+i);
		}
	}
}
public class ThreadCreate2
{
public static void main(String args[])
{
Thread t1=new Thread(new A("thread-0"));
Thread t2=new Thread(new B("thread-1"));
t1.start();
t2.start();

}

}