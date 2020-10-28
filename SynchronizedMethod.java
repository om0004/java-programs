class A extends Thread
{	
public void run()
{
 B.dog(getName());	
}
}
class B
{
public static synchronized void  dog(String name)
{
for(int i=0;i<5;i++)
	System.out.println(name+":"+i);
}
}
class SynchronizedMethod
{
	public static void main(String args[])
	{
		A t1=new A();
		A t2=new A();
		t1.start();
		t2.start();
	}
}