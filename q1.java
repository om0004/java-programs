import java.util.*;
/*
Reeky Creeks Fun world is an entertainment complex. The owner of Reeky Creeks wants to implement a gondola lift
system that would connect some of its theme parks and hotels. Gondola lift is a seating compartment in a ski lift like
cable cars. The maximum permissible mass of each Gondola with occupants is 1000 kg.
Implement a software system to check the total weight in Gondola and throw an exception in case the total weight is
greater than permissible limit.
Weight of Gondola without occupants is 300 kg.
*/
class excep extends RuntimeException
{
	public excep(String msg)
	{
		super(msg);
	}

} 
class Gondola
{
HashMap<Integer,Double> ticketForGondola()
{
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Double> h=new HashMap<Integer,Double>();
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		Integer a=sc.nextInt();
		Double b=sc.nextDouble();
		h.put(a,b);
	}
	return h;


}
void weightCheck(HashMap<Integer,Double> h) throws excep
{
	Double weight=0.0;
for(Double d:h.values())
{
	weight=weight+d;
}
if(weight>700)
{
	throw new excep("overloaded");
}
else
{
	System.out.println("enjoy");
}

}

}
public class q1
{
	public static void main(String args[])
	{
		Gondola obj=new Gondola();
		HashMap<Integer,Double>h=new HashMap<Integer,Double>();
		h=obj.ticketForGondola();
		try
		{
         obj.weightCheck(h);
		}
		catch(excep e)
		{
			System.out.println(e.getMessage());
		}
	}
}