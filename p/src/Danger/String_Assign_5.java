package Danger;

public class String_Assign_5 
{
// i/P = My name is sanjeev
// O/P = Occurence of chracter of e
	
	public static void main(String[] args)
	{
		String s="My name is Sanjeev";
		char[] ch=s.toCharArray();
		int count =0;
		for(char c:ch)
		{
			if(c=='e')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
