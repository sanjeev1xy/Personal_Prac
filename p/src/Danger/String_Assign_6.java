package Danger;

public class String_Assign_6 
{
// I/P =1010101
// O/P =1111000	
	
	public static void main(String[] args) 
	{
		int n=1010101;
		int l=String.valueOf(n).length();
		int a , b=0 , c=1;
		
		for(int i=0 ;i<l ;i++)
		{
			a=n%10;
			if(a==1)
			{
				b=b*10+a;
			}
			else if (a==0)
			{
				c=c*10;
			}
			n=(n-a)/10;
		}
		System.out.println(b*c);
	}
}
