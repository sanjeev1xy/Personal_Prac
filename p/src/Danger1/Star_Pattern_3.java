package Danger1;

public class Star_Pattern_3 
{
//Plz Make it print below pattern
	
	//*
	//**
	//***
	//****
	//*****
	//****
	//***
	//**
	//*
	
	public static void main(String[] args) 
	{
		for( int i=1 ;i<=5 ;i++)
		{
			for(int j=1 ;j<=i ;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1 ;i<=5;i++)
		{
		 for(int j=4 ;j>=i ;j--)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		}
	}
}
