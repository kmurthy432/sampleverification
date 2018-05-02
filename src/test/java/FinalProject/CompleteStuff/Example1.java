
package FinalProject.CompleteStuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.cat.com/CwsLogin/cws/login.htm?appid=login");
		driver.findElement(By.id("cwsUID")).sendKeys("ghumas");
		driver.findElement(By.id("cwsPwd")).sendKeys("Sonali.deloitte@1");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(8500);
		
		System.out.println("current URL Is : " +driver.getCurrentUrl());
		
	
		
	}
