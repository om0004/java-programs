class tryexcept
{
	public static void main(String args[])
	{
		try
		{
		try
		{
			int b=39/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("what are you doing!");
		}
		try{
			int arr[]=new int[8];
			arr[8]=12;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	}
}