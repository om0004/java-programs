import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// Complete the class below as sopecified above.
class A implements Runnable
{
int num;
public A(int d)
{
this.num=d;
}
public void run()
{
System.out.println("CodeQuotient Thread"+num);
}
}

public class JavaPool
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int j=n;
  ExecutorService t=Executors.newFixedThreadPool(3);
  for(int i=0;i<n;i++)
  {
    A obj=new A(j);
    j--;
    t.execute(obj);
   }
  t.shutdown();
  }
}
