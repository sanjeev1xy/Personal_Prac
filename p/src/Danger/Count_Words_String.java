package Danger;

import java.util.Scanner;

public class Count_Words_String 
{
public static void main(String[] args)
{
	System.out.println("Plz Enter the string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int count=1;
	
	for(int i=0 ; i<s.length()-1 ; i++)
	{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
			count++;
		}
	}
	
	System.out.println(" count of word in the string is "+count);
}
}
