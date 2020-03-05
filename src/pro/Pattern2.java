package pro;

import java.util.Scanner;

public class Pattern2 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value");
		int n =	sc.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=n;j<=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.println("*");
			}System.out.println("");
		}
	
sc.close();
	}

}
