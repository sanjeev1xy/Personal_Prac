package Danger;

import java.util.HashMap;
import java.util.Map;

public class String_S_aabbcc_output_a2b3c2 
{
	//1st Approach
	public static void main(String[] args) 		
	{	
	String s="ffffaabbcc";
    // map char-int pair
    Map<Character, Integer> mp = new HashMap<Character, Integer>();
    // map over string
    for (char c : s.toCharArray())
    {
        if (mp.containsKey(c)) 
        {
            mp.put(c, mp.get(c) + 1);
        }
        else
        {
            mp.put(c, 1);
        }
    }
    // printing the char with their frequency
    System.out.println("All character in string with their frequency :");
    for (Map.Entry<Character, Integer> entry : mp.entrySet())
    {
        System.out.print(entry.getKey() + "" + entry.getValue());
    }
		
		//2nd Approach
		
//		String str="ffffaabbbcceeeaaa";
//		
//		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
//		
//		for(int i=0 ;i<str.length();i++)
//		{
//			if (map.containsKey(str.charAt(i)))
//			{
//				map.put(str.charAt(i), map.get(str.charAt(i))+1);
//			}
//			
//			else
//			{
//				map.put(str.charAt(i), 1);
//			}
//		}
//		
//		map.forEach((key,value)-> System.out.print(key+ ""+value));
//		
}
}
