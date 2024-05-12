package Danger3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class M_Generic_Method_Dropdown_using_Select_class
{
	public static void selectByValue(String value , WebElement element)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectByIndex(int i , WebElement element1)
	{
		Select s1=new Select(element1);
		s1.selectByIndex(i);
	}
	public static void selectByVisibleTex (String Text , WebElement element2)
	{
		Select s1=new Select(element2);
		s1.selectByVisibleText(Text);
	}
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjeev Kumar Thakur\\eclipse-workspace1\\Introduction\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	WebElement drop=driver.findElement(By.name("birthday_day"));
	selectByIndex(6, drop);
   
	
}
}
