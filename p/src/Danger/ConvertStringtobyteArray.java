package Danger;

import java.util.Arrays;

public class ConvertStringtobyteArray
{
	
	
public static void main(String[] args) 
{
	String s="Sanjeev";
	byte [] byt=s.getBytes();
	System.out.println(Arrays.toString(byt));
	
	byte [] b1= {'s' , 'a' ,'n' ,'j' , 'e' ,'e' ,'v'};
	byte [] b2= {83, 97, 110, 106, 101, 101, 118};
	String s1= new String(b1);
	String s2=new String(b2);
	System.out.println(s1);
	System.out.println(s2);
}
}
