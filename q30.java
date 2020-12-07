import java.util.*;
/*
CANDIES
Badri is standing at the door of his classroom. There are currently N students in the class, i'th student got Ai
 candies.
There are still M more students to come inside the class. At every instant, a student enters the class and seated with a student who has
exactly the same number of candies. For each student, Badri shouts YES if such a student with same number of candies is found, NO
otherwise.
First line contains an integer T. T test cases follow. First line of each case contains two space-separated integers N and M.
Second line contains N + M space-separated integers, the candies of the students.
Output Format
For each test case, output M new line, Badri's answer to the M students.
Print "YES" (without the quotes) or "NO" (without the quotes) pertaining to the Badri's answer.
Explanation (refer sample input & output below for more understanding):
Initially students with 3 and 2 candies are in the class.
A student with 9 candies enters the class, no student with 9 candies in class. Hence, Badri shouts "NO"
A student with 11 candies enters the class, no student with 11 candies in class. Hence, Badri shouts "NO"
A student with 2 candies enters the class, student with 2 candies found in class. Hence, Badri shouts "YES"
*/
public class q30
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		int k=0;
		for(int i=0;i<z;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[m+n];
			int arrr[]=new int[m];
			HashSet<Integer>hash=new HashSet<Integer>();
			k=0;
			for(int j=0;j<m+n;j++)
			{
				arr[j]=sc.nextInt();
				if(j<n)
				{
					hash.add(arr[j]);
					continue;
				}
			    if(hash.add(arr[j]))
			    	arrr[k++]=0;	
			    else
			    	arrr[k++]=1;
			}
			for(int j:arrr)
			{
				if(j==0)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
			hash.clear();
		}

	}
}