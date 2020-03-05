package pro;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{

	public int compare(Student obj1, Student obj2)
	{
		return  obj1.getSid()-obj2.getSid();
	}

}
