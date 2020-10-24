class removeduplicates
{
	public static void main(String args[])
	{
		int[] arr={30,20,10,10,20,20,40};
		int temp[]=new int[50];
		int j=0,i;
		for(i=0;i<arr.length;i++)
		{
			temp[arr[i]]=temp[arr[i]]+1;
		}
		for(i=0;i<arr.length;i++)
		{
			if(temp[arr[i]]==1)
			{
				arr[j]=arr[i];
				j++;
			}
			if(temp[arr[i]]>=2)
			{
				arr[j]=arr[i];
				j++;
				temp[arr[i]]=0;
			}
		}
		for(i=0;i<j;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}