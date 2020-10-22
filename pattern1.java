import java.util.*;
class pattern1
{
	public static void main(String args[])
	{
		int i,j,k;
		Scanner a=new Scanner(System.in);
		for(i=1;i<=4;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
				for (j=1;j<2;j++)
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}