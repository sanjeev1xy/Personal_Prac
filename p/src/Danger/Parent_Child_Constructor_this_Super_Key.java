package Danger;

public class Parent_Child_Constructor_this_Super_Key 
{
	public Parent_Child_Constructor_this_Super_Key()
	{
		this(1,2,3);
		System.out.println("Parent defult constructor ");
	}
	
	public Parent_Child_Constructor_this_Super_Key(int a)
	{
		this();
		System.out.println("Parent single parametrized cinstructor");
	}
	public Parent_Child_Constructor_this_Super_Key(int a , int b)
	{
		this(1);
		System.out.println("parent two parametrized constructor ");
	}
	
	public Parent_Child_Constructor_this_Super_Key(int a , int b , int u)
	{
		System.out.println("parent Three parametrized constructor ");
	}
	
	public Parent_Child_Constructor_this_Super_Key(int a , int b , int u , int y)
	{ 
		this(1,2);
		System.out.println("parent Four parametrized constructor ");
	}
}
