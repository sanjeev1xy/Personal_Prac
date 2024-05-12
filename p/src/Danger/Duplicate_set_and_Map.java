package Danger;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicate_set_and_Map 
{
public static void main(String[] args) 
{
	
	//hashset
//	HashSet< String> hasset=new HashSet<String>();
//	hasset.add("Sanjeev");
//	hasset.add("Thakur");
//	hasset.add("Automation");
//	hasset.add("Automationsdet");
//	System.out.println("normal hasset value "+hasset);
//	hasset.add("Sanjeev");
//	hasset.add("Thakur");
//	System.out.println("dulicate value is "+hasset);
//	hasset.add(null);
//	System.out.println("first time add the null value "+hasset);
//	hasset.add(null);
//	System.out.println("multiple time add the null value "+hasset);
	
	
	// Hashmap
	
	  HashMap<Integer, String> hasmap=new HashMap<Integer , String>();
	  hasmap.put(1, "sanjeev");
	  hasmap.put(2, "kumar"); 
	  hasmap.put(3, "Thakur");
	  System.out.println("normal hasmap value is "+hasmap); 
	  hasmap.put(2,"kumar1");
	  hasmap.put(3, "Thakur");
	  System.out.println("Dulicate value is "+hasmap); 
	  hasmap.put(5, null);
	  System.out.println("first time add null value "+hasmap);
	  hasmap.put(6, null);
	  System.out.println("dulicate value is "+hasmap);
	 
}
}
