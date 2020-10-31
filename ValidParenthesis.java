import java.util.*;
public class ValidParenthesis
{
	public static void main(String args[])
	{for(int i=0;i<ch.length;i++)
		{
			
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Map<Character,Character>map=new LinkedHashMap<Character,Character>();
		Stack<Character> stk=new Stack<Character>();
		map.put('(',')');
		map.put('{','}');
		map.put('[',']');
		char[] ch=str.toCharArray();
		if(map.containsKey(ch[i]))
				stk.push(ch[i]);
			else if(map.get(stk.peek())==ch[i])
				stk.pop();
			else
			{
				System.out.println("Invalid");
				break;
			}

		} 
		if(stk.isEmpty())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}