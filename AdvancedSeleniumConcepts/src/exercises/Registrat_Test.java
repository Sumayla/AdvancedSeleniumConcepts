package exercises;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class Registrat_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void testTitle() {
	      //write your code to Register
		
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("AdnanP");
		driver.findElement(By.id("LastName")).sendKeys("Parvez");
		driver.findElement(By.id("Email")).sendKeys("AdP@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("piddi123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("piddi123");
		driver.findElement(By.id("register-button")).click();
		WebElement button=driver.findElement(By.xpath(" //input[@value='Continue']"));
		
		
		  boolean Expected = true;
		  boolean Actual= button.isDisplayed();
	 System.out.println("Assert.assertEquals(Actual, Expected)");
	  }
	  

}
