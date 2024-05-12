package Danger;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjeev Kumar Thakur\\eclipse-workspace\\p\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("htttps://www.youtube.com/");
		String parent=driver.getWindowHandle();
		System.out.println("parent window is id "+parent);
		driver.findElement(By.xpath(""));
		Set<String> allWindow =driver.getWindowHandles();
	    int count= allWindow.size();
	    System.out.println("Total window "+count);
	    for (String Child:allWindow)
	    {
	    	if(!parent.equalsIgnoreCase(Child))
	    	{
	    		driver.switchTo().window(Child);
	    		driver.findElement(By.xpath(""));
	    		Thread.sleep(3000);
	    		driver.close();
	    	}
	    	
	    	driver.switchTo().window(parent);
	    	System.out.println("parent window title is "+driver.getTitle());;
	    }
	
	
	
	/*// how to convert list to arraylist and how to click individual tab  just write the code
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjeev Kumar Thakur\\eclipse-workspace\\p\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("htttps://www.youtube.com/");
	String parent=driver.getWindowHandle();
	System.out.println("parent window is id "+parent);
	driver.findElement(By.xpath(""));
	Set<String> allWindow =driver.getWindowHandles();
	ArrayList<String> tab=new ArrayList<>(allWindow);
	tab.get(0);
	tab.get(1);
	driver.switchTo().window(tab.get(2));
	System.out.println("Title of parent window is "+driver.getTitle());*/
	
}
}