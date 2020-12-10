import java.util.*;
/*
Repeated String
Write a program to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive
repeated word.
For example in the sentence "Rohan is a good good boy", the word "good" is repeated. The program should turn "Rohan is a good good boy"
into "Rohan is a good boy".
Input Format
The first line contains an integer denoting the number of sentences.
Each of the subsequent lines contains a sentence.
Output Format
In each line should display the input sentences after removing the repeated words leaving only the first occurrence.
*/
public class q31
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String z="";
		for(int i=0;i<n;i++)
			{
				String a=sc.nextLine();
				LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
				String token[]=a.split("\\s");
				for(int j=0;j<token.length;j++)
				{
					if(map.containsKey(token[j]))
						{
							map.put(token[j],map.get(token[j])+1);
						}
					else if(z.equalsIgnoreCase(token[j]))
						{
							map.put(z,map.get(z)+1);
						}	
					else
						{
							map.put(token[j],1);
							z=token[j];
						}
				}
				for(Map.Entry m:map.entrySet())
				{
					if((Integer)m.getValue()>=1)
						{
							System.out.print(m.getKey()+" ");
							map.put((String)m.getKey(),0);
						}
				}
				System.out.println();
			}
	}
}