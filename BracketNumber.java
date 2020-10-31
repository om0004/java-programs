import java.util.*;
//The first line contains an integer T, the number of test cases. For each test case, there is a string containing round brackets.
public class BracketNumber
{
static void printBracketNumber(String a,int n)
{
int z=1,h=0;
Stack<Integer>st=new Stack<Integer>(); 
for(int i=0;i<a.length();i++)
{
	if(a.charAt(i)=='(')
	{
		System.out.print(z);
		st.push(z);
		z++;
	}
	if(a.charAt(i)==')')
	{
		System.out.print(st.pop());
	}
}
System.out.println();
}	
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
for(int i=0;i<t;i++){
String exp = scan.next();
printBracketNumber(exp, exp.length());
}
 }
}
