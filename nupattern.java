import java.util.*;
class nupattern
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(j);
			}
			for(j=i;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}