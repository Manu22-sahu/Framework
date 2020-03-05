package pro;

import java.util.ArrayList;
import java.util.Collections;

public class Assgn1 extends MyComparator{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList al= new ArrayList();
		al.add(11);
		al.add(2);
		al.add(34);
		al.add(55);
		al.add(43);
		System.out.println(al);
		Collections.sort(al, new MyComparator());
		System.out.println(al);
	}

}
