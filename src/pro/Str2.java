package pro;

public class Str2 {

	public static void main(String[] args) 
	{
		String str1="Manali";
		String str2="";
		String str3="";
		char ch[]=str1.toCharArray();
		
		for(int i=(ch.length-1)/2;i>=0;i--)
		{
			str2=str2+ch[i];
		}
	
		System.out.println(str2);
		
		for(int j=ch.length-1;j>=(ch.length)/2;j--)
		{
			str3=str3+ch[j];
		}System.out.println(str3);
		System.out.println(str3+str2);
	}

}
