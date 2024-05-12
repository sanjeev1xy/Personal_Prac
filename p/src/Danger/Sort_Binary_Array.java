package Danger;

public class Sort_Binary_Array 
{
 // I/P = 1,0,1,0,0,1,1,0,0,2
// O/P =  0 0 0 0 0 1 1 1 1 2 
	public static void sortbinaryaraay(int a[] , int n)
	{
	int j=-1;
	for(int i=0 ;i<n ;i++)
	{
		// if number is smaller than 1
        // then swap it with j-th number
		if(a[i]<1)
		{
		j++;
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		
		}
	}
	}
	
	public static void main(String[] args) 
	{
		int [] a= {1,0,1,0,0,1,1,0,0,2};
		int n=a.length;
		
		// Function call
		sortbinaryaraay(a, n);
		for(int i=0;i<n ;i++)
		{
			System.out.print(a[i]+" ");
		}
			
	}
	
}
