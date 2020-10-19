class mergesort
{
	int temp[]=new int[7];
	int b[];


	public void sort(int arr)
	{
		int length=arr.length;
		this.b=arr;
		divide(0,length-1);
	}
	public void divide(int low,int high)
	{
		int middle=low+(high-low)/2;
		divide(low,middle);
		divide(middle+1,high);
		merge(lower,middle,higher);
	}
	public void merge(int lower,int middle,int high)
	{
		for(int z=lower;z<=high;z++)
		{
			temp[z]=arr[z];
		}
		int i=lower;
		int j=middle+1;
		int k=lower;


	}

	public static void main(String args[])
	{
	int[] arr={48,36,13,52,19,94,21};
	mergesort obj=new mergesort();
	obj.sort(arr);
    }

}