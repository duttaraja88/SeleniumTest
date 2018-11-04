package com.dutta.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		WebDriver driver = new ChromeDriver(chromeOptions);

		System.out.println("Hi, Welcome Edureka Certification Project");

		driver.get("http://18.224.169.134:8100/index.php");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("About Us")).click();
//		Thread.sleep(5000);
		WebElement element = driver.findElement(By.tagName("b"));
		String text = element.getText();
		System.out.println("text=" + text);

		if (text.equalsIgnoreCase("about")) {
			System.out.println("Certification Project test Successful");
		} else {
			System.out.println("Certification Project test Failed");
		}
		// driver.findElement(By.id("PID-ab2-pg"))args;
		// if(title.equalsIgnoreCase("Welcome Page")){
		// System.out.println("Login Successful");
		// }
		// else{
		// System.out.println("Login Failed");
		// }
		driver.quit();
	}
}
