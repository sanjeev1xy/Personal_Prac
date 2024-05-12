package Danger;

import java.util.Scanner;

public class Palindrome_String 
{
public static void main(String[] args) 
{
	System.out.println("Plz enetr string ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String orgstr=s;
	String revstr="";
	
	for(int i=s.length()-1 ;i>=0 ;i--)
	{
		revstr=revstr+s.charAt(i);
	}
	if(orgstr.equals(revstr))
	{
		System.out.println("this is a palindrome string ");
	}
	else
	{
		System.out.println("This is not a palindrome string");
	}
	
}	
}
