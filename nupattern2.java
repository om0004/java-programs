class nupattern2
{
	public static void main(String args[])
	{
		int i,j,count=0,t;
		for(i=1;i<=5;i++)
			{
				if(i%2==1)
				{
					for(j=1;j<=3;j++)
					{
						count+=1;
						System.out.print(count);
					}
				}
				else
				{
					t=count;
					for(j=3+count;j>t;j--)
					{
						count+=1;
						System.out.print(j);
					}
				}
				System.out.println("");
			}
	}
}