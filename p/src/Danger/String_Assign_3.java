package Danger;

import java.util.Scanner;

public class String_Assign_3 
{
	//I/p = My name is Sanjeev 
	// o/p = yM eman si veejnaS 
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String revstr="";
		
		for(String w:s1)
		{
			String revword="";
			for(int i=w.length()-1 ;i>=0 ;i--)
			{
				revword=revword+w.charAt(i);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println(revstr);
		
	}
}