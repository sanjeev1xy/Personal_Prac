package Danger1;

public class Star_Reverse_Diagonal_Pattern_11 
{
// Plz Make a print of below pattern
	

//          *     
//        *
//     *
//   *
// *
	
	public static void main(String[] args) 
	{
		for(int i=1 ;i<=5 ;i++)
		{
			for (int j=5 ;j>=i ;j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ;k<=i ;k++)
			{
				if(i>=2 &&k>1)
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
