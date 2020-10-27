import java.util.*;
import java.io.*;
public class Streamtok
{

public static void main(String args[]) throws IOException
{
	Reader x=new StringReader("myname1234dog12121mnn211");
	StreamTokenizer st=new StreamTokenizer(x);
	while(st.nextToken()!=StreamTokenizer.TT_EOF)
	{
		if(st.ttype==StreamTokenizer.TT_NUMBER)
			System.out.println(st.nval);
		else if(st.ttype==StreamTokenizer.TT_WORD)
			System.out.println(st.sval);
	}
}

}