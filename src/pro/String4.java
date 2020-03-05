package pro;

public class String4 {

	public static void main(String[] args) {

		String str1="Anusha";
		String str2="";
		
		char ch[]=str1.toCharArray();
		
		for(int i=0; i<=(ch.length-1)/2;i++)
		{
			str2=str2+ch[i];
		}
		for(int j=(ch.length-1)/2;j>=ch.length;j--)
		{
			System.out.println(str2);
		}
		
	}

}
