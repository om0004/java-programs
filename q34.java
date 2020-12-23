import java.util.*;
/*
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if
A is correct, (A) and {A} and [A] are also correct.
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
Given a string, determine if it is balanced or not.
*/
public class q34
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int d=0;
		HashMap<Character,Character>map=new HashMap<Character,Character>();
		Stack<Character>st=new Stack<Character>();
		map.put('{','}');
		map.put('(',')');
		map.put('[',']');
		for(int i=0;i<n.length();i++)
		{
			if(map.containsKey(n.charAt(i)))
			{
				st.push(n.charAt(i));
			}
			else if(st.isEmpty())
			{
				System.out.print("Not Balanced");
				d++;
			}
			else if(n.charAt(i)==map.get(st.peek()))
			{
				st.pop();
			}
		}
		if(d==0)
		{
		if(st.isEmpty())
		{
			System.out.print("balanced parenthesis");
		}
		else
		{
			System.out.println("Not balanced");
		}
	}
	}
}
