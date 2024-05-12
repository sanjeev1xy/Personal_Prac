package Danger3;

public class H_Debugging 
{
	        //Step Over=F6 key
			//Step into=F5 key
			//Step return=F7 key 
int a;
public void method()
{
	System.out.println("First line of class");
	System.out.println("Second line of class");
}
public void method1()
{
	System.out.println("First line of class1");
	System.out.println("Second line of class1");
}
public static void main(String[] args)
{
	System.out.println("I am The boss");
	System.out.println("Main method first line");
	System.out.println("Main method second line");
	
	H_Debugging s=new H_Debugging();
	s.method();
	System.out.println("Value of a is "+s.a);
	s.a=115;
	System.out.println("Third line of main method ");
	s.method1();
	System.out.println("value of a is  "+s.a);
	System.out.println("FInal line of main method ");
}
}
