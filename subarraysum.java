class subarraysum
{
	static public void main(String args[])
	{
		int[] arr={4,-2,-3,4,-1,-2,1,5,-3};
		int large=-999;
		int max=0,s=0,end=0,i,start=0;
		for(i=0;i<arr.length;i++)
		{
			max=max+arr[i];
			if(large<max)
			{
				large=max;
				start=s;
				end=i;
			}
			if(max<0)
			{
				max=0;
				s=1+i;
			}
		}
		System.out.println(large+" "+start+" "+end);


	}
}