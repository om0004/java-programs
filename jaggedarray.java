class jaggedarray
{
	public static void main(String args[])
	{
		int[][] arr=new int[4][];
		int i,j;
		for(i=0;i<arr.length;i++)
			arr[i]=new int[i+1];
		int count=0;
		for(i=0;i<arr.length;i++)
			{
				for(j=0;j<arr[i].length;j++)
				{
					arr[i][j]=count++;
				}
			}
			for(i=0;i<arr.length;i++)
			{
				for(j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
	}
}