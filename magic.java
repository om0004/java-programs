class Stu
{
    int num;
    String name;
    Student()
    {
        System.out.println("a");
    }
}
    public class Magic
    {
        int num;

        Main()
        {
           System.out.println("b"); 
        }
	public static void main(String[] args) {
	    Main obj=new Main();
	    System.out.println(obj.num);
	    Student obj1=new Student();
	    System.out.println(obj1.num);
	    System.out.println(obj1.name);
	    
		
	}
}
