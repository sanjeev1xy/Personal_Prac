package Danger;

import java.util.Scanner;

public class ArmstrongNumber 
{
public static void main(String[] args)
{
	System.out.println("Plz Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int rem ,rev=0;
	while(n>0)
	{
		rem=n%10;
		rev=(rem*rem*rem)+rev;
		n=n/10;
	}
		if(rev==temp)
		{
			System.out.println("Armstrong Number");
		}
		
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
}

