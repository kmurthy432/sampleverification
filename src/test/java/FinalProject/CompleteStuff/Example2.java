package FinalProject.CompleteStuff;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {
	
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
		
		driver.get("http://hybris-qa.cat.com");
		
		Thread.sleep(10500);
		
		}
		


}
