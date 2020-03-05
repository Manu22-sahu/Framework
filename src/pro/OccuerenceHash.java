package pro;

import java.util.HashMap;

public class OccuerenceHash {

	public static void main(String[] args) 
	{
		String str1= "testYantra";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		char c[]=str1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(hm.containsKey(c[i]))
			{
				hm.put(c[i],hm.get(c[i])+1);
			}
			else
			{
				hm.put(c[i], 1);
			}
		}System.out.println(hm);
		
	}

}
