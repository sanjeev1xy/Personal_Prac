package Danger;

public class Count_Single_Chrac_String
{
public static void main(String[] args)
{
	String s="my name is sanjeev";
	
	 int Total_Length= s.length();
	int Total_length_remove= s.replace("a", "").length();
	
	int count=Total_Length-Total_length_remove;
	
	System.out.println("occurenace of a "+count);
	
	}
}
