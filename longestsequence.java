import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class longestsequence{
    public static void main(String[] args)
    {
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int i,j,k,h,q=0,d;
      int [][]temp=new int[100][100];
      for(h=0;h<n;h++)
      {
        int z=a.nextint()
        int[] arr=new int[z];
        for(i=0;i<temp.length;temp++)
          temp[i]=0;
        for(i=0;i<arr.length;i++)
        {
          for(j=i+1;j<arr.length;j++)
          {
            if(a[j]>a[i])
            {
              if(d==0)
                q++;
              temp[q][k]=a[j];
              k++;
              d++;
            }
            else
            {
              d=0;
              break;
            }
          }
        }
      }
      for(i=0;i<)
  
    }
}