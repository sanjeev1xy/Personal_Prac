package Danger;

import java.util.HashMap;
import java.util.Map;

public class Count_Every_Chrac 
{
//	// 1st Approach
public static void main(String[] args) 
{
	
	//String s="my name is sanjeev Kumar Thakur";
	String s="abcsaartc";
	HashMap<Character, Integer> countmap= new HashMap<>();
	for (int i=s.length()-1 ;i>=0 ; i--)
	{
		if(countmap.containsKey(s.charAt(i)))
		{
			int count=countmap.get(s.charAt(i));
			countmap.put(s.charAt(i), ++count);
		}
		else
		{
			countmap.put(s.charAt(i),1);
		}
	}
	
	System.out.println(countmap);
}
}
	
	// 2nd Approach
	// for alphabetic order count
	
	// second Approach -- Genric method approach 
	
//	public static void getCharCount(String name)
//	{
//		HashMap<Character, Integer> mapcount=new HashMap<>();
//		char strArray[] =name.toCharArray();
//		for(char c:strArray)
//		{
//			if(mapcount.containsKey(c))
//			{
//				mapcount.put(c, mapcount.get(c)+1);
//			}
//			else
//			{
//				mapcount.put(c, 1);
//			}
//		}
//		System.out.println(name +" "+mapcount);
//	}
//	
//	public static void main(String[] args) 
//	{
//		getCharCount("sanjeev");
//		getCharCount("my name is sanjeev kumar Thakur");
//		getCharCount("abcsaartc");
//	}
//}

