class staticvariable
{
	int a=10;
	static int b=20;
	public static void main(String args[])
	{
		staticvariable ob1=new staticvariable();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob1.a=1000;
		ob1.b=2000;
		staticvariable ob2=new staticvariable();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		
		
		
	}
}