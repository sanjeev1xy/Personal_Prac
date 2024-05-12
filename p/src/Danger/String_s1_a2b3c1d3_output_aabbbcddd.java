package Danger;

public class String_s1_a2b3c1d3_output_aabbbcddd
{
public static void main(String[] args) 
{
	String s1="a2b1c3d4";
	
	for(int i=0 ;i<s1.length() ;i++)
	{
		if(Character.isAlphabetic(s1.charAt(i)))
		{
			System.out.print(s1.charAt(i));
		}
		
		else
		{
			int y=Character.getNumericValue(s1.charAt(i));
			for (int j=1 ;j<y ;j++)
			{
				System.out.print(s1.charAt(i-1)); // i-1 basically iterate the loop i.e a2 2-1 b3 3-2 like that
			}
		}
	}
}
}
