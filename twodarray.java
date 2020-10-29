class twodarray
{
	public static void main(String args[])
	{

		int[][] a={{10,20,30,40},{50,60},{70,80,90}};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}
	}
}