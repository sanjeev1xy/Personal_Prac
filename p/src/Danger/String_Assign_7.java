package Danger;

import java.util.Scanner;

public class String_Assign_7 
{
// I/P =	My name is Sanjeev
// O/P =	veejnaS si eman yM


	public static void main(String[] args) 
	{
		System.out.println("Plz enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String revstr="";
		
		for(int i=s.length()-1 ;i>=0 ;i--)
		{
			revstr=revstr+s.charAt(i);
		}
		System.out.println(revstr);
		
	}
}
