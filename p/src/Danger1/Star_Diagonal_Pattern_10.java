package Danger1;

public class Star_Diagonal_Pattern_10 
{
//Plz make a print below pattern

//     *     
//      *
//       *
//        *
//         *
	
	public static void main(String[] args)
	{
		for(int i=1 ;i<=5 ;i++)
		{
			for (int j=1 ;j<=i ;j++)
			{
				if(i>=2 && j<=i-1)
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
