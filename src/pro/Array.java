package pro;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		int a1[]= {1,5,8};
		System.out.println("Enter number to be added");
		int n= sc.nextInt();
		String str1="";
		
		for(int i=0;i<a1.length;i++)
		{
			str1 = str1+a1[i];
		}
		
		System.out.println(str1);

		int num = Integer.parseInt(str1);
		
		int total=num+n;
		
		//String str2= String.valueOf(total);
		String str2 =""+total;
		System.out.println(str2);
		
		String narr[] = str2.split("");
		
		int b[]=new int[narr.length];
		
		for(int i=0;i<narr.length;i++)
		{
			b[i]=Integer.parseInt(narr[i]);
		}
		for(int i=0;i<narr.length;i++)
		{
			System.out.println(narr[i]);
		}
		sc.close();
	
	}

}
