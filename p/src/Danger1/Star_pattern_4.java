package Danger1;

public class Star_pattern_4 
{
	// Plz make it print below pattern
	//           *
    //         * *
    //       * * *
    //     * * * *
   //    * * * * * 


public static void main(String[] args)
{
	for(int i=1 ;i<=5;i++) // for Space
	{
		for(int j=4;j>=i;j--) // for SPace 
		{
			System.out.print(" "); // space print
		}
		
		for(int k=1 ;k<=i ;k++)  // for star 
		{
			System.out.print("*"); // Star Print
		}
			System.out.println(); // move to next line 
	}
}
}
