import java.util.*;
class pattern3
{
	static public void main(String args[])
	{
		int i,j,k;
		for(i=0;i<5;i++)
		{
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			if(i>0)
			System.out.print("*");
			System.out.println("");
		}
	}
}