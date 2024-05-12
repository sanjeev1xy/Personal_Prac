package Danger;

import java.util.Scanner;

import com.beust.jcommander.Strings;

public class SwappingTwoNumbersUsingThirdVariable 
{

	public static void main(String[] args) 
	
{
	System.out.println("Plz Eneter the values of a & b");
	Scanner sc=new  Scanner(System.in);   //System.in is passed as a parameter in Scanner class. 
	                                      //It tells the java compiler that system input will be 
	                                      //provided through console(keyboard)
	int a , b, c; //1, 2 , 3
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Values before swapping"+a+" ,"+b);
	c=b; // c=2
	b=a; //b=1
	a=c; //a=2
	System.out.println("Values after swapping"+a+","+b);
}
}
