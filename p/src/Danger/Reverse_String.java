package Danger;

import java.util.Scanner;

public class Reverse_String
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Plz Enter the String");
	String s=sc.nextLine();
	String[] split=s.split(" ");
	String revstr="";
	
	for(String w:split)
	{
		String revword="";
		
		for(int i=w.length()-1 ; i>=0 ;i--)
		{
			revword=revword+w.charAt(i);
		}
		
		revstr=revstr+revword+" ";
	}
	
	System.out.println(revstr);
	
}
}
