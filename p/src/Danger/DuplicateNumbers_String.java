package Danger;

import java.util.HashSet;

public class DuplicateNumbers_String 
{
public static void main(String[] args) 
{
	//int arr[]= {1,2,2,3,4,5,5,6,6,7,4,1,9,8,3,10,10};
	//String [] arr= {"java" ,"sanjeev","sanjeev" ,"kumar", "kumar"};
//
//	//1st Approach
//	boolean flag=false;
//	for(int i=0 ;i<arr.length ;i++)
//	{
//		for(int j=i+1 ;j<arr.length ;j++)
//		{
//			if (arr[i]==arr[j])
//					{
//				System.out.println("print dupicate number "+arr[i]);
//				flag=true;
//					}
//		}
//		
//	}
//	if(flag==false)
//	{
//		System.out.println("duplicate element not found");
//	}
	
	//2nd Approach by hasset because hashset not allow duplicate value
	HashSet<String> langs=new HashSet<String>();
	System.out.println(langs.add("sanjeev"));
	System.out.println(langs.add("java"));
	System.out.println(langs.add("sanjeev"));
	/*
	 * Boolean flag=false; for(String t:arr) { if(langs.add(t)==false) /// for
	 * duplicate comparing to the false {
	 * System.out.println("duplicate element is "+t); flag=true; } } if(flag==false)
	 * { System.out.println("duplicate element not found"); }
	 */
}
}
