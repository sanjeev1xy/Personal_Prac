package Danger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sort_Map_based_on_values 
{
  public static void main(String[] args) 
  {
	HashMap<String, Integer> mapvalue=new HashMap<>();
	mapvalue.put("sanjeev", 100);
	mapvalue.put("Kumar", 20);
	mapvalue.put("Thakur", 150);
	mapvalue.put("skt", 10);
	mapvalue.put("tks", 3);
	mapvalue.put("sanjee", -1);
	
	List<Map.Entry<String, Integer>> list=new ArrayList<>(mapvalue.entrySet());
	Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() 
	{
		public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2)
		{
			
			return e1.getValue()-e2.getValue(); // sorting method using 
		}
		
	});
	
	for (Entry<String , Integer>e:list)
	{
		System.out.println(e.getKey()+" "+e.getValue());
	}
}
}
