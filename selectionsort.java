class selectionsort
{
	public static void main(String args[])
	{
		int[] a={38,52,9,18,6,63,13};
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}
}