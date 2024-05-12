package Danger;

public class Couny_Capitalized_String 
{
public static void main(String[] args)
{
	String s1="Count Capitalized Words In String $$";
	int countLowerCase=0;
	int countUpperCase=0;
	char [] ch=s1.toCharArray();
	for(char ch1:ch)
	{
		if(ch1>='A' && ch1<='Z')
		{
			countUpperCase++;
		}
		
		else if (ch1>='a' && ch1<='z')
		{
			countLowerCase++;
		}
		else
		{
			continue;
		}
	}
	
	System.out.println("count of upper case letter    "+countUpperCase+"   count of lower case letter   "+countLowerCase);
}
}
