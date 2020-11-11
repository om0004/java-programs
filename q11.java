import java.util.*;
/*
There is a Department of the college which needs some details of students information: RollNo, FirstName, and Student
CGPA. So rst take students details from user then arrange the list of students according to their CGPA in decreasing
order. For example If two student have the same CGPA, then arrange them according to their rst name in alphabetical
order. If there are also students with same name, then order them according to their RollNo(ID). Every students should
have the unique RollNo(ID). CGPA should be less then equal to 5
Approach : Enter the rst line of input which contains an integer, representing the total number of students. Then
next lines will contain a details of a student information in same line given in the following structure:
Input Format
RollNo FirstName StudentCGPA 
*/
class Student implements Comparable<Student>
{
	private int roll;
	private String name;
	private double marks;
	Student(int roll,String name,double marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
	public double getMarks()
	{
		return marks;
	}
	public int compareTo(Student s)
	{
		if(s.getMarks()==this.marks)
		{
			if(s.getName().equals(this.name))
			{
				if(s.getRoll()>this.roll)
					return 1;
				else
					return -1;
			}
			else if(s.getName().compareTo(this.name)<0)
				return 1;
			else
				return -1;
		}
		else if(s.getMarks()>this.marks)
			return 1;
		else
			return -1;
	}
}
public class q11
{
	public static void main(String args[])
	{
		ArrayList<Student>list=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			double c=sc.nextDouble();
			list.add(new Student(a,b,c));
		}
		Collections.sort(list);
		for(Student p:list)
		System.out.println(p.getName());
	}
}