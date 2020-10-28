import java.util.*;
class SwapFirstAndlast
{
	public static void main(String args[])
	{

		String s1=new String("Code Quotient");
		char[] ch=s1.toCharArray();
		int k=0;	
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				char temp=ch[i-1];
				ch[i-1]=ch[k];
				ch[k]=temp;
				k=i+1;
				
			}
			if(i==s1.length()-1)
			{
				System.out.println(k);
				char temp=ch[i];
				ch[i]=ch[k];
				ch[k]=temp;
			}

		}
		String s2=new String(ch);
		System.out.print(ch);

	}
}