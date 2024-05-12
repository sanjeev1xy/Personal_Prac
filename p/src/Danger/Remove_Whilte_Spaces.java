package Danger;

public class Remove_Whilte_Spaces 
{
public static void main(String[] args) 
{
	String s1="my nameyoyboghjk   fxgchgjh              cchgj";
	//\\s is a regular expression that matches any white space character, 
	//including space, tab, and newline. By using replaceAll() ,
	//we are able to remove all these white space characters, not just spaces.
	String s2=s1.replaceAll("\\s", "");  // \\s exactly matches with white spaces
	System.out.println(s2);
	
}
}
