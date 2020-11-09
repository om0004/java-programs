import java.util.*;
/*
Input 5 numbers in a Priorityqueue and print their ascending order, no matter what the sequence of input is
*/
public class q8
{
	public static void main(String le[])
	{
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		for(int i=0;i<5;i++)
			q.add(sc.nextInt());
		while (q.isEmpty() == false)
       System.out.printf("%d ", q.remove());


	}
}