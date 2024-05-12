package Danger;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutUsingThirdVariable 
{
public static void main(String[] args)
{
	System.out.println("Plz Enter the number a and b");
	Scanner sc=new Scanner(System.in);
	int a, b; // 1,2 
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("values before swapping"+a+","+b);
	a=a+b;  //a=3 
	b=a-b;  // b=1 
	a=a-b;  // a=2
	
	System.out.println("Values after swapping"+a+","+b);
}
}
