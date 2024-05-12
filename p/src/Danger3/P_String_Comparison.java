package Danger3;

public class P_String_Comparison 
{
	//== it will compare the address
	//.equals it will compare the content
	//compare to  it will compare the asciivalue
public static void main(String[] args)
{
	// using == comparison equal keyword
	
//	String s="Sanjeev"; // SCP
//	String s1="Sanjeev"; // SCP
//	
//	if(s==s1)
//	{
//		System.out.println("Address is same ");
//	}
//	else
//	{
//		System.out.println("Address is not same ");
//	}
//			
//	// using == comparison new keyword
//	
//	String s3=new String("Sanjeev"); // Heap , every time make a object 
//	String s4=new String("Sanjeev");  // Heap , every time make a object 
//	
//	if(s3==s4)
//	{
//		System.out.println("Address is same ....");
//	}
//	else
//	{
//		System.out.println("Address is not same .....");
//	}
	
	// using .equals comparison equal keyword
	
//		String s="Sanjeev"; // SCP
//		String s1="Sanjeev"; // SCP
//		
//		if(s==s1)
//		{
//			System.out.println("Address is same ");
//		}
//		else
//		{
//			System.out.println("Address is not same ");
//		}
//				
//		// using .equals comparison new keyword 
//		
//		String s3=new String("Sanjeev"); // Heap , every time make a object 
//		String s4=new String("Sanjeev");  // Heap , every time make a object 
//		
//		if(s3==s4)
//		{
//			System.out.println("Address is same ....");
//		}
//		else
//		{
//			System.out.println("Address is not same .....");
//		}
	
	// compare to 
	
	String s= "sanjeev";
	String s1=new String("sanjeev");
	System.out.println(s.compareTo(s1)); // Ascii value is different compare to ascii chart
	
}
}
