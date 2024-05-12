package Danger;


public class Parent_Child_Constructor_this_Super_Keyword extends Parent_Child_Constructor_this_Super_Key
{
	//// output should be like this Parent 3 ,Parent Default ,Parent 1 ,Parent 2 ,parent 4 ,child 3 ,child default ,child 4 ,child 1 ,child 2
	public Parent_Child_Constructor_this_Super_Keyword()
	{
	  this(1,2,3);
		System.out.println("child defult constructor ");
	}
	
	public Parent_Child_Constructor_this_Super_Keyword(int d)
	{
		this(9,3,5,6);
		System.out.println("child single parametrized cinstructor");
	}
	public Parent_Child_Constructor_this_Super_Keyword(int t , int p)
	{
		this(1);
		System.out.println("child two parametrized constructor ");
	}
	
	public Parent_Child_Constructor_this_Super_Keyword(int t , int p, int r)
	{
		super(1,2,3,4);
		System.out.println("child Three parametrized constructor ");
		
	}
	public Parent_Child_Constructor_this_Super_Keyword(int t , int p, int r , int d)
	{
		this();
		System.out.println("child Four parametrized constructor ");
	}
	
	public static void main(String[] args)
	{
		Parent_Child_Constructor_this_Super_Keyword s=new Parent_Child_Constructor_this_Super_Keyword(12,5);
		
	}
}

