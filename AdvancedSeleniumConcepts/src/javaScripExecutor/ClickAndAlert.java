package javaScripExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndAlert {

	public static void main(String[] args) {
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
						
		driver.get("http://demo.guru99.com/V4/");	
	      JavascriptExecutor js = (JavascriptExecutor)driver;	
	      
	      WebElement button =driver.findElement(By.name("btnLogin"));			
  		
	        
	        try {
				driver.findElement(By.name("uid")).sendKeys("mngr34926");					
				driver.findElement(By.name("password")).sendKeys("amUpenu");	
				
				js.executeScript("arguments[0].click();", button);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        		
	        js.executeScript("alert('Adnan is amazing');");
	        
				
	}

}
