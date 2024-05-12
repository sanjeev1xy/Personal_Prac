package Danger1;

public class Star_Pattern_2 
{
	// Plz make it print below star print 
	//*****
	//****
	//***
	//**
	//*
	
	public static void main(String[] args)
	{
		for(int i=1 ;i<=5 ;i++) // for star
		{
			for(int j=5 ;j>=i ;j--) // For Star
			{
				System.out.print("*"); //Print Star 
			}
			
			System.out.println(); // Move to next line 
		}
	}
}
