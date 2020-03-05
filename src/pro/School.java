package pro;

import java.util.ArrayList;
import java.util.Collections;

public class School
{

	public static void main(String[] args) 
	{
		ArrayList<Student>al=new ArrayList<Student>();
		
		al.add(new Student(12,"Mounika"));
		al.add(new Student(90,"Anusha"));
		al.add(new Student(1,"Manali"));
		al.add(new Student(6,"Kush"));
		al.add(new Student(3,"Deepak"));
//		Collections.sort(al, Student.sortBySid);
//		System.out.println(al);
		
		Collections.sort(al, new MyComparator());
		System.out.println(al);
		
	}

}
