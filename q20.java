import java.util.*;
/*
The following factors will be considered by the selection
committee when selecting teams for different tournaments.
1. Form
2. Training
3. Supporting team-mates
4. Future development potential
5. Work Ethics (Punctuality and Attire )
6. Behavior
Each player is provided with points out of 10 for each factor. Total point for a player is 60 but each factor has its own
importance in game so its added with some value factor. All 6 factors have different value factor and can be
calculated using following data
form_value= form_points * 3
training_factor= training_point* 2.5
Support_factor=Support_point*2
future_potential_factor= future_potential_point*1.5
Ethics_factor= Ethics_point*1
behavior_factor= behavior_point*0.5
Summation of all these value would be the overall points for a player out of 100. Develop a system which displays the
list of players name and their total points in ascending order of their total points
*/
class Study implements Comparable<Study>
{
	int []arr=new int [6];
	String s;
	double points;
	public Study(String s,int[] arr)
	{
		this.s=s;
		this.arr=arr;
		pointCalculate();
	}
	public String getName()
	{
		return s;
	}
	public int[] getMarks()
	{
		return arr;
	}
	public void pointCalculate()
	{
		double k=3;
		for(int i=0;i<6;i++)
		{
			this.points=this.points+arr[i]*k;
			k=k-0.5;
		}
	}
	public String toString()
	{
		return s+" "+this.points;
	}
	public int compareTo(Study obj)
	{
		if(obj.points<this.points)
			return 1;
		else 
			return -1;
	}
}
public class q20
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of Students:");
	int n=sc.nextInt();
	ArrayList<Study> l=new ArrayList<Study>();
	int []arr=new int[6];
	for(int i=0;i<n;i++)
	{
		sc.nextLine();
		System.out.print("Enter Student name:");
		String s=sc.nextLine();
		System.out.println("Enter Student marks:");
		for(int j=0;j<6;j++)
		{
			arr[j]=sc.nextInt();
		}
		l.add(new Study(s,arr));
	}
	Collections.sort(l);
	for(Study x:l)
	{
		System.out.println(x);
    }
}
}