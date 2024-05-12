package Danger;

public class Count_letters_String
{
public static void main(String[] args)
{
	String str="9hjghjhdgfsdfghjfds";
	int count =0;
	
	for(int i=0 ;i<str.length() ;i++)
	{
		if(Character.isLetter(str.charAt(i)))
		{
			count++;
		}
		
	}
	System.out.println("letters in the string are "+count);
}
}
