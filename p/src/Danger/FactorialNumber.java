package Danger;

import java.util.Scanner;

public class FactorialNumber 
{
public static void main(String[] args) 
{
	System.out.println("Plz Enter the Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int fact=1;
	for (int i=1 ;i<=n ;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of Number  "  +fact);
}
}
