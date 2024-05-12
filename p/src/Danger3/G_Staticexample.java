package Danger3;

public class G_Staticexample 
{
static int a;
public void increment()
{
	a=a+1;
}
public static void abc()
{
	System.out.println("i am static ");
}
public static void main(String[] args) 
{
	System.out.println("***********obj1**************");
	G_Staticexample obj1=new G_Staticexample();
	obj1.increment();
	System.out.println("Value of a "+obj1.a);
	System.out.println("***********obj2**************");
	G_Staticexample obj2=new G_Staticexample();
	obj2.increment();
	System.out.println("Value of a "+obj2.a);
	G_Staticexample.abc();
	System.out.println(G_Staticexample.a);
}
}
