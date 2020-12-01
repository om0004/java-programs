import java.util.*;
/*
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
 The first line of each test case contains four distinct strings, denoting ingredients needed for the first dish. 
 Each ingredient is represented by a string of length between 2 and 10.
inclusive, consisting of lowercase English letters. The second line of each test case describes the second dish in the same format.
Output Format
For each test case, output a single line containing the answer — similar if at least half of the ingredients are same, 
and dissimilar otherwise (without the quotes).
*/
public class q28
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		HashSet<String>hash=new HashSet<String>();
		ArrayList<String> l=new ArrayList<String>();
		int count=0;
		for(int i=0;i<n;i++)
		{
			String a=sc.nextLine();
			String b=sc.nextLine();
			String []token=a.split("\\s");
			String []tokens=b.split("\\s");
			for(int j=0;j<token.length;j++)
			{
				hash.add(token[j]);
			}
			for(int j=0;j<tokens.length;j++)
			{
				if(hash.add(tokens[j]))
				{

				}
				else
				{
					count++;
				}
			}
			if(count>=2)
				l.add("similar");
		    else
		    	l.add("dissimilar");
		    hash.clear();
		    count=0;
		}
		System.out.print(l);	
	}
}