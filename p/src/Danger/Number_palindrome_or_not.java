package Danger;

import java.util.Scanner;

public class Number_palindrome_or_not
{
public static void main(String[] args) 
{
	System.out.println("Plz enter the values");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int rev=0 , rem;
	
	while(temp!=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(n==rev)
	{
		System.out.println("Number is palindrome "+n);
	}
	else
	{
		System.out.println("Number is not palindrome"+n);
	}
		
	
}
}
