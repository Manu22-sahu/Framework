package pro;

public class String2 {

	public static void main(String[] args) {
		
		String str1="Manali";
		String str=str1;
//		char ch[]= str.toCharArray();

		for(int i=0; i<str.length();i++)
		{
			char s1=str.charAt(i);
			String s2 =str1.substring(1);
			s2=s2+s1;
			str1=s2;
			System.out.println(s2);
		}
		
	}
}
