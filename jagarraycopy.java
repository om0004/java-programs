import java.util.Arrays;
class jagarraycopy
{
	public static void print(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void main(String args[])
	{
		int [][]a1={{1,2,3},{4,5},{6,7,8}};
		int i,j;
		int[][] a2=new int[a1.length][];
		print(a1);
		for(i=0;i<a2.length;i++)
		{
			/*
			a2[i]=new int[a1[i].length];
			*/
			System.Arrayscopy(a2[i],0,a1[i],0,a2[i].length);
			/*
			for(j=0;j<a2[i].length;j++)
			{
				a2[i][j]=a1[i][j];
			}*/
		}
		print(a2);

}
}