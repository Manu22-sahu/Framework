package pro;

import java.util.ArrayList;
import java.util.Collections;

public class ArrL1 {
	
public static void main(String[] args)
{
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al1.add(10);
	al1.add(50);
	al1.add(48);
	al1.add(30);
	al1.add(33);
	
	ArrayList<Integer> al2 = new ArrayList<Integer>();
	al2.add(22);
	al2.add(11);
	al2.add(56);
	al2.add(90);
	al2.add(78);
	
	ArrayList<Integer> al3 =new ArrayList<Integer>();
	al3.add(20);
	al3.add(15);
	al3.add(57);
	al3.add(99);
	al3.add(80);
	
	ArrayList<Integer> al4 =new ArrayList<Integer>();
	al4.add(19);
	al4.add(9);
	al4.add(68);
	al4.add(100);
	al4.add(79);
	
	al.add(al1);
	al.add(al2);
	al.add(al3);
	al.add(al4);
	
for(int i=0;i<al.size();i++)
{
	if(i%2==0)
	{
		Collections.sort(al.get(i));
		System.out.println(al.get(i));
	}
	else
	{
		Collections.sort(al.get(i), new MyComparator() );
		System.out.println(al.get(i));
	}
	
}
		

}
}
