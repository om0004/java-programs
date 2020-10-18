import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class kaprekar
{
    public static void main(String[] args)
    {   // Write your code here
      Scanner a=new Scanner(System.in);
      kaprekar ob=new kaprekar();
      int i,h,s,chk1,chk2,chk3,chk4,chk5;
      int z=a.nextInt();
      for(i=0;i<z;i++)
      {
        h=a.nextInt();
        s=(int)(Math.pow(h,2));
        chk1=ob.check1(h,s);
        chk2=ob.check2(h,s);
        chk3=ob.check3(h,s);
        chk4=ob.check4(h,s);
        chk5=ob.check5(h,s);
        if(chk1==1||chk2==1||chk3==1||chk4==1||chk5==1)
        {
          System.out.println("1");
        }
        else
        {
          System.out.println("0");
        }
      }
        
  }
    int check1(int h,int k)
    {
      int sum=0;
      sum=k/100+k%100;
      if (sum==h)
        return 1;
      else
        return 0;
    }
    int check2(int h,int k)
    {
      int sum=0;
      sum=k%10;
      if(sum==h)
        return 1;
      else
        return 0;
    }
    int check3(int h,int k)
    {
      int sum=0;
      sum=k/1000+k%1000;
      if(sum==h)
        return 1;
      else
        return 0;
    }
    int check4(int h,int k)
    {
      int sum=0;
      sum=k/10000+k%10000;
      if(sum==h)
        return 1;
      else
        return 0;
    }
    int check5(int h,int k)
    {
      int sum=0;
      sum=k/10+k%10;
      if (sum==h)
        return 1;
      else
        return 0;
    }
}