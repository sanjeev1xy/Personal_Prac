package Danger1;

public class Star_Pattern_Blank_Sqaure_Rectangle_Pattern_15 
{
	//Plz Make a print of below Pattern
	
//  *****
//	*   *
//	*   *
//	*   *
//	*****	
	
	public static void main(String[] args) 
	{
		for (int i=1 ;i<=5;i++)
		{
			for(int j=1 ;j<=5 ;j++)
			{
				if(i>=2 && j>=2 && i<=4 && j<=4)
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
