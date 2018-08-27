package com.dutta.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args ) throws Exception
    {
    	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
    	WebDriver driver = new ChromeDriver(chromeOptions);

    	System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
    	
    	//driver.get("http://localhost:8081/selenium-website");
    	driver.get("http://http://18.223.124.18:8181/selenium-website");
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	driver.findElement(By.name("userName")).sendKeys("dutta");
    	//Thread.sleep(5000); 
    	driver.findElement(By.name("pass")).sendKeys("dutta");
    	//Thread.sleep(5000); 
    	driver.findElement(By.id("submit-3")).click();
        //Thread.sleep(5000); 	
    	String title = driver.getTitle();
    	if(title.equalsIgnoreCase("Welcome Page")){
    		System.out.println("Login Successful");
    	}
    	else{
    		System.out.println("Login Failed");
    	}
        driver.quit();
    	


    }
}
