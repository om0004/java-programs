public class Kadane
{
	public static void main(String args[])
	{
		int []arr={1,-3,2,1,-1};
		int max_c=arr[0],max_g=arr[0];
		for(int i=1;i<arr.length-1;i++)
			{
				max_c=Math.max(arr[i],max_c+arr[i]);
				if(max_c>max_g)
					max_g=max_c;
			}
			System.out.print(max_g);

	}
}