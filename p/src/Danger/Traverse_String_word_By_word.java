package Danger;

import java.util.Scanner;

import org.apache.commons.math3.geometry.spherical.oned.ArcsSet.Split;

public class Traverse_String_word_By_word 
{
public static void main(String[] args)
{
	System.out.println("Plz enter the string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[]s1=s.split(" ");
	
	for(int i=0 ;i<s1.length;i++)
	{
		System.out.print(s1[i]);
	}
	
} 
}
