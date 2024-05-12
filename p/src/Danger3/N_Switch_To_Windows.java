package Danger3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class N_Switch_To_Windows 

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjeev Kumar Thakur\\eclipse-workspace1\\Introduction\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		search.sendKeys("Automation Testing videos");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		WebElement video= driver.findElement(By.id("video-title"));
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
        String firsttab=driver.getWindowHandle();
        System.out.println("Before switching url is ");
        System.out.println(driver.getCurrentUrl());
		Set<String>alltabs=driver.getWindowHandles();
		System.out.println("Total tab is "+alltabs.size());
		for(String s:alltabs)
		{
			driver.switchTo().window(s); // 2nd tab
		}
		System.out.println("after switching url is "+driver.getCurrentUrl());
		driver.switchTo().window(firsttab);
		System.out.println("final url is "+driver.getCurrentUrl());
		
	}
}
