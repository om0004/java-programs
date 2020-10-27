class secondlargest
{
public static void main(String args[])
{
	int[] arr={12,43,67,2,11,90,9};
	int large=0;
	int s=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>large)
		{
			s=large;
			large=arr[i];
		}
		if(arr[i]<large&&arr[i]>s)
			{
				s=arr[i];
			}
	}
	System.out.print(s);
}
}