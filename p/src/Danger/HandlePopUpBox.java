package Danger;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUpBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjeev Kumar Thakur\\eclipse-workspace\\p\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("htttps://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("parent window is id "+parent);
		Set<String> allWindow =driver.getWindowHandles();
	    int count= allWindow.size();
	    System.out.println("Total window "+count);
	    for (String Child:allWindow)
	    {
	    	if(!parent.equalsIgnoreCase(Child))
	    	{
	    		driver.switchTo().window(Child);
	    		Thread.sleep(3000);
	    		driver.close();
	    	}
	    	
	    	driver.switchTo().window(parent);
	    	System.out.println("parent window title is "+driver.getTitle());;
	    }
	}
}


