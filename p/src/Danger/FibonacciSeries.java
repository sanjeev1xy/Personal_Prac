package Danger;

import java.util.Scanner;

public class FibonacciSeries 
{
public static void main(String[] args) 
{
	System.out.println("Plz Enter the Number");
	Scanner sc=new Scanner(System.in);
	int n , a=0 ,b=1 ,c;
	n=sc.nextInt();
	System.out.println("Fibonacci numbers are :  ");
	System.out.println(a+" "+b);
	for(int i=1 ;i<=n ;i++)
	{
		 c=a+b;
		 System.out.println(" "+c);
		a=b;
		b=c;
		
	}
	
	
}
}
