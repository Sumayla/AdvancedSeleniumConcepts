package exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Title_Test {

	public static void main(String[] args) {
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manzoormehadi26@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("manzoor");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String actual=driver.findElement(By.linkText("manzoormehadi26@gmail.com")).getText();
		System.out.println(actual);
		
		boolean result=driver.findElement(By.linkText("manzoormehadi26@gmail.com")).isDisplayed();
		System.out.println(result);
		driver.close();
		

	}

}
