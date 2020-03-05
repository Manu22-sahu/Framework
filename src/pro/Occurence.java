package pro;

public class Occurence {

	public static void main(String[] args) 
	{

		String str1="testyantra";

		char ch[]=str1.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{	int count =1;
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				count++;
				ch[j]=' ';
			}
		}System.out.println(ch[i]+" "+count);
		}
		
	}

}
