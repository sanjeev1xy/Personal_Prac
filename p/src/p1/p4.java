package p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p4  
{
public void abc()
{
System.out.println("body given by child");	
}

public void xyz()
{
	System.out.println(" body given to the parent ");
}
public static void main(String[] args) 
{
	p4 s=new p4();
	s.abc();
	s.xyz();
}
	
}
	



