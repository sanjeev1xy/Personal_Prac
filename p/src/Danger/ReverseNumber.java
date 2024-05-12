package Danger;

import java.util.Scanner;

public class ReverseNumber 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("plz eneter the number");
	int n , temp ,rev=0 ,rem;
	n=sc.nextInt();
	temp=n;
	while(temp!=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	
	if(n==rev)
	{
		System.out.println("Number is reverse " +n);
	}
	
	else 
	{
		System.out.println("Number is not reverse "+n);
	}
}
}
