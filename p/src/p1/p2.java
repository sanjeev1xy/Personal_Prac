package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class p2 
{
public static void main(String[] args)
{
	/*//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjeev Kumar Thakur\\eclipse-workspace\\p\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://paymentboxbeta.oto.com/");
	driver.manage().window().maximize();
	String s=driver.getTitle();
	System.out.println(s);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	//driver.close();
	driver.quit();*/
	
	/*int num=5;
    String San="My Name is Sanjeev";
    char letter='c';
    float dec=5.99F;
    double decr=5.888;
    boolean bt=true;
    
    System.out.println(num);
    System.out.println(San+"  my name");
    
    //array
    int[] array=new int[5];
    array[0]=1;
    array[1]=2;
    array[2]=3;
    array[3]=4;
    array[4]=5;
    // for loop =array.length=5
    for(int i=0;i<array.length;i++)
    {
    	System.out.println(array[i]);
    }
    
    int[] arra1= {1,2,3,4,5,6,7,8,9};
    for(int i=0;i<arra1.length;i++)
    {
    	System.out.println(arra1[i]);
    }
     System.out.println(arra1[4]);*/
     
     /*String[] name= {"Sanjeev","Akshay","kumar"};
      List<String>namearraylist=Arrays.asList(name);
     System.out.println( namearraylist.contains("Sanjeev"));
     System.out.println(name[1]);*/
     /*for(int i=0;i<name.length;i++)
     {
    	 System.out.println(name[i]);
     }
     
     for(String s:name)
     {
    	 System.out.println(s);
     }*/
	
	/*int [] arr= {1,2,3,45,66,8,54,34235,5654,34534,1000};
	//out=even number
	for (int i=0;i<arr.length;i++)
	{
		if (arr[i]%2==0)
		{
			System.out.println(arr[i]);
			break;
		}
		else
		{
			System.out.println(arr[i]+"  is not multiple of 2");
		}
	}*/
	/*
	ArrayList<String>a=new ArrayList<String>();
	a.add("Rahul");
	a.add("Sanjeev");
	a.add("AAkash");
	a.add("Akhil");
	//System.out.println(a.get(3));
	for(int i=0 ;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println("****************************");
	for(String val:a)
	{
		System.out.println(val);
	}
	//item is present in the arraylist
	System.out.println(a.contains("Rahul"));*/
	
	/*String s="Sanjeev Kumar Thakur";
	String [] splittedstring=s.split("Kumar");
	System.out.println(splittedstring[0]);
	System.out.println(splittedstring[1]);
	System.out.println(splittedstring[1].trim());
	System.out.println(s.charAt(0));
	for(int i=0;i<=s.length();i++)
	{
	System.out.println(s.charAt(i));
	}
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.println(s.charAt(i));
	}*/
	

	//{  
	    
	        //System.out.println(10 + 20 + "Testing");   
	        //System.out.println("QATesting" + 10 + 20);  

			   
			     /* String str1 = "Count Capitalized Words In String $$";
			      int upperCase = 0;
			      int lowerCase = 0;
			      char[] ch = str1.toCharArray();
			      for(char chh : ch) {
			         if(chh >='A' && chh <='Z') {
			            upperCase++;
			         } else if (chh >= 'a' && chh <= 'z') {
			            lowerCase++;
			         } else {
			            continue;
			         }
			      }
			      System.out.println("Count of Uppercase letter/s is/are " + upperCase + " and of Lowercase       letter/s is/are " + lowerCase);
			   }*/
	
	// Count occurrence of every element in arrays 
		
		int [] arr= {1,2,3,4,5,6,5,4,3,2,1};
		countoccurance(arr);
		
	}
public static void  countoccurance(int arr[])
{
	Arrays.sort(arr);
	for (int i=0 ;i<arr.length-1;i++)
	{
		int count=1;
		for (int j=i+1 ;j<arr.length ;j++)
		{
			if(arr[i]==arr[j])
				count++;
			else
				break;
		}
		System.out.println(arr[i]+" ->"+count);
		i+=(count-1);
	}
	
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjeev Kumar Thakur\\eclipse-workspace\\p\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://rahulshettyacademy.com/");
	driver.get("https://paymentboxbeta.oto.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.id("email")).sendKeys("sanjeev8697@gmail.com");
*/
}
}

