package Danger3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class O_Findelements_use 
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
		List<WebElement>Ls=driver.findElements(By.id("video-title"));
		System.out.println("total videos is "+Ls.size());
		Ls.get(1).click();
		System.out.println(driver.getCurrentUrl());
		// now we want to play all the videos
				Actions ac=new Actions(driver);
				for(WebElement element:Ls)
				{
					element.click(); // Video play
					Thread.sleep(4000);
					driver.navigate().back();
					ac.sendKeys(Keys.ESCAPE).perform();
				}
				
		
    
	}
	
}
