package Danger;

public class FizzBuzz 
{
public static void main(String [] args)
{
	// Say Fizz if the number is divisible by 3.
	//Say Buzz if the number is divisible by 5.
	//Say FizzBuzz if the number is divisible by both 3 and 5.
	//Return the number itself, if the number is not divisible by 3 and 5.
	
   int n=100;
   for(int i=1 ;i<=n ;i++)
   {
	   if(i%15==0)
	   {
		   System.out.println("fizbuzz");
	   }
	   
	   else if (i%3==0)
	   {
		   System.out.println("fizz");
	   }
	   
	   else if(i%5==0)
	   {
		   System.out.println("buzz");
	   }
	   
	   else
	   {
		   System.out.println(i);
	   }
	   
   }
}
}
