import java.util.*;
class quicksort
{

    public static void sort(int arr[],int start,int end)
    {
    	if(start<end)
    	{
    		int p=partition(arr,start,end);
    		sort(arr,start,p-1);
    		sort(arr,p+1,end);
    	}

    } 
    public static int partition(int arr[],int start,int end)
    {
    	int pivot=arr[end];
    	int p=start;
    	for(int i=start;i<end;i++)
    	{
    		if(arr[i]<pivot)
    		{
    			swap(arr,i,p);
    			p++;
    		}
    	}
    	swap(arr,p,end);
    	return p;
    }
    public static void swap(int arr[],int a, int b)
    {
    	int temp;
    	temp=arr[a];
    	arr[a]=arr[b];
    	arr[b]=temp;
    }
	public static void main(String args[])
	{
		int[] arr={7,2,1,6,8,5,3,4};
		sort(arr,0,7);
		for(int k:arr)
		{
			System.out.print(k+" ");
		}

	}
}