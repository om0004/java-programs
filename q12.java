import java.util.*;
/*
User has to create a phone book and later on which can be used to query. 
The phone book contains entries consists of people's names and their phone number. 
After that you will be given some person's name as query. For each query, print the phone number of that person.
*/
public class q12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("No of entries in phonebook:");
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.print("Enter name:");
			String a=sc.nextLine();
			System.out.print("Enter number:");
			Integer b=sc.nextInt();
			map.put(a,b);
		}
		sc.nextLine();
		System.out.print("Enter name for phone number:");
		String c=sc.nextLine();
		if(map.containsKey(c))
			System.out.print(map.get(c));
		else
		{
			System.out.print("Could not find name");
		}

	}
}