import java.util.*;
/*
The collector of Rajpura had ordered a complete revision of the Voters List. He knew that constructing the list of voters is a difficult task,
prone to errors. Some voters may have been away on vacation, others may have moved during the enrollment and so on.
To be as accurate as possible, he entrusted the task to three different officials. Each of them was to independently record the list of voters
and send it to the collector. In Rajpura, every one has an ID number and the list would only list the ID numbers of the voters and not their
names. The officials were expected to arrange the ID numbers in ascending order in their lists.
23 30 42 57 90
21 23 35 57 90 92
21 23 30 57 90
then the final list compiled by the collector would be:
21 23 30 57 90
The ID numbers 35, 42 and 92 which appeared in only one list each do not figure in the final list.
Your task is to help the collector by writing a program that produces the final list from the three given lists.
The first line of the input contains 3 integers N1, N2 and N3
N1 is the number of voters in the first list,N2 is the number of voters in the second list and N3
 is the number of voters in the third list. The next N1
 lines (lines 2,...,N1+1) contain one positive integer each and describe the first list in
ascending order. The following N2
lines (lines N1+2,...,N1+N2+1) describe the second list in ascending order and the final N3
 lines
(lines N1+N2+2,...,N1+N2+N3+1) describe the third list in ascending order.
Output Format
The first line of the output should contain a single integer M indicating the number voters in the final list. The next M lines (lines 2,...,M+1) should
contain one positive integer each, describing the list of voters in the final list, in ascending order.
*/
public class q27
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n,j=0;
		Integer arr[]=new Integer[n1];
		TreeMap<Integer,Integer>l=new TreeMap<Integer,Integer>();
		for(int i=0;i<n1;i++)
		{
			n=sc.nextInt();
			if(l.containsKey(n))
            	l.put(n,l.get(n)+1);
			else
				l.put(n,1);	
		}
		for(int i=0;i<n2;i++)
		{
			n=sc.nextInt();
			if(l.containsKey(n))
            	l.put(n,l.get(n)+1);
			else
				l.put(n,1);	
		}
		for(int i=0;i<n3;i++)
		{
			n=sc.nextInt();
			if(l.containsKey(n))
            	l.put(n,l.get(n)+1);
			else
				l.put(n,1);	
		}
		for(Map.Entry m:l.entrySet())
		{
			if((Integer)(m.getValue())>=2)
			{
				arr[j]=(Integer)m.getKey();
				j++;
			}
		}
		System.out.println(j);
		for(int i=0;i<j;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
