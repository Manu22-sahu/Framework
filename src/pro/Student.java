package pro;

//import java.util.Comparator;

public class Student 
{
	private int sid;
	private String sname;
	
//	public static Comparator<Student> sortBySid =new Comparator<Student>()
//	{
//		public int compare(Student o1, Student o2) 
//		{
//		return  o1.getSid()-o2.getSid();
//		}
//	};

	Student(int a,String b)
	{
		this.sid=a;
		this.sname=b;
	}
	
	public String toString()
	{
		return this.sname+" "+"Student Id ="+this.sid;
	}
	
	public int getSid() 
	{
		return this.sid;
	}

}

