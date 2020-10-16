import java.util.*;
public class CaptalizeEachWord
{
	static String capitalizeFirstChar(String str)
{
String token[]=str.split("\\s");
	String c="";  
for(int i=0;i<token.length;i++)
{  
    String first=token[i].substring(0,1);  
    String afterfirst=token[i].substring(1);  
    c+=first.toUpperCase()+afterfirst+" "; 
}
return c.trim();
}
	public static void main(String[] args)
 {
  int t,i,j=0;
  String a="This is line one Hello, welcome to programming Code Quotient - Get better at coding this is last line of file.",b;
  Scanner s=new Scanner(System.in);
    b=capitalizeFirstChar(a);
    System.out.println(b);
  }
 }

