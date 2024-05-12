package Danger;

import java.util.Scanner;

public class Prime_Number 
{
public static void main(String[] args)
{
	System.out.println("Plz enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int t=0;
	
	for(int i=2 ; i<n-1 ;i++)
	{
		if(n%i==0)
		{
			t=t+1;
		}
	}
	if(t>0)
	{
		System.out.println("Number is not prime Number");
	}
	else
	{
		System.out.println("Number is prime number");
	}
}
}
