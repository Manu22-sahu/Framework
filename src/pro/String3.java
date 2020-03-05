package pro;

public class String3 {

	public static void main(String[] args) {
		
		String str1="Anusha";
	
		char ch[]=str1.toCharArray();
		char t=ch[0];
		for(int i=1;i<=ch.length-1;i++)
		{
			ch[i-1]=ch[i];
		}
		
		ch[ch.length-1]=t;
		System.out.println(ch);
	}
}
