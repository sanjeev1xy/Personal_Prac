package Danger1;

public class Star_Patern_ReverseofPaatern12_Pattern13 
{
//Plz Make a print of below pattern
	
//     *
//    * *
//   *   *
//  *     *
// *       *

	public static void main(String[] args) 
	{
		for (int i=1 ;i<=5 ;i++)
		{
			for(int j=5 ;j>=i ;j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ;k<i*2;k++)
			{
				if(k>1 &&k<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
