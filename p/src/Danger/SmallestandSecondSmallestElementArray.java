package Danger;

import java.util.Arrays;

public class SmallestandSecondSmallestElementArray 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,-1,4,5,6,7,9};
		   int n=arr.length;
		   System.out.println("length of array is "+n);
		   
	           Arrays.sort(arr);
		
	           System.out.println("smallest element is "+ arr [0]);
	           System.out.println("second smallest element is "+arr[1]);
		  
	}
   
}
