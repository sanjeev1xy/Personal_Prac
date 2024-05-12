package Danger;

import java.util.Scanner;

public class String_Assign_4 
{
// i/p = My name is Sanjeev My
// o/p = Occurence of word of My
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String word="My";
		String [] s1=s.split(" ");
		int count=0;
		for(int i=0 ;i<s1.length ;i++)
		{
			if(word.equals(s1[i]))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
}
