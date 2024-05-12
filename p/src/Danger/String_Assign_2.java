package Danger;

import java.util.Scanner;

public class String_Assign_2 
{
//I/p = My name is Sanjeev 
// o/p = Sanjeev is name My
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter the string ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String [] s1=s.split(" ");
		String rev="";
		for(int i=s1.length-1;i>=0 ;i--)
		{
			rev=rev+s1[i]+" ";
		}
		System.out.println(rev);
	}
}
