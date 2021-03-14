package com.techno.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBLogin 
{
	public WebDriver d;
	public WebElement Uid;
	public WebElement Pass;
	public WebElement LogBT;
	
	
	@AfterMethod
	public void titlecatch()
	{
    	String tit = d.getTitle();
    	System.out.println("The title is: " +tit);
	}
    
    @BeforeMethod
    public void m1()
    {
    	System.out.println("Next test case executed.....");
    }
    
    
    @BeforeTest
    public void setup()
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
    	d = new ChromeDriver();
    	d.manage().window().maximize();
    	d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }
    
    @Test(priority = 1)
    public void fbpage()
    {
    	d.get("https://www.facebook.com");
    }
    
    @Test(priority =2)
    public void login()
    {
    	Uid = d.findElement(By.id("email"));
    	Uid.sendKeys("Dhanashreegaikwad11@gmail.com");
    	Pass = d.findElement(By.id("pass"));
    	Pass.sendKeys("da@1118143");
    	LogBT = d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
    	LogBT.click();
    	
    }
}
