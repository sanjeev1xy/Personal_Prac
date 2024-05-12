package Danger1;

public class Star_Reverse_Pyramid_Without_Space_Pattern_9
{
//Plz make a print below pattern 
	
//	    *********
//	     *******
//	      *****
//	       ***
//	        *
	
	//1st Approach
	
//	public static void main(String[] args)
//	{
//		for(int i=1 ;i<=5 ;i++)
//		{
//			for (int j=1 ;j<=i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=5 ;k>=i ;k--)
//			{
//				System.out.print("*");
//			}
//			for(int l=4 ;l>=i ;l--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	//2nd Approach
	
//	public static void main(String[] args) 
//	{
//		for(int i=1 ;i<=5 ;i++)
//		{
//			for (int j=1 ;j<=i ;j++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int k=11 ;k>=i*2 ;k--)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//	}
	
	//3rd Appraoch
	
	public static void main(String[] args)
	{
		for(int i=5 ;i>=1 ;i--)
		{
			for(int j=5 ;j>i ;j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ;k<i*2 ;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
