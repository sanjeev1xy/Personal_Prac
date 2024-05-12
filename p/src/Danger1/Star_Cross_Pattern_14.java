package Danger1;

public class Star_Cross_Pattern_14 
{
//Plz Make a print of below pattern
//  *   *
//	 * * 
//	  *  
//	 * * 
//	*   *	
	
	public static void main(String[] args)
	{
		for (int i=0 ;i<5 ;i++)
		{
			for(int j=0 ;j<5 ;j++)
			{
				if(i==j || i+j==5-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
