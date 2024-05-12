package Danger;

import java.util.Arrays;

public class Integer_Array_Sort_Without_Using_Inbuild_Method 
{
	public static void main(String [] args)
	{
int [] arr= {-1,0,100,78,34,32,10,4,1,2,34,87};

for(int i=0 ;i<arr.length ;i++)
{
	for(int j=i+1 ;j<arr.length ;j++)
	{
		if(arr[i]>arr[j])
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
	}
}
for(int i=0 ;i<arr.length ;i++)
{
	System.out.print(arr[i]+" ");
}

}
}