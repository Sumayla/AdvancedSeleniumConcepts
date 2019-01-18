package exercises;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Radio_Link {
public static WebDriver driver;

	
	
@BeforeMethod
public void setUp() {
	System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//driver.get("http://demowebshop.tricentis.com/");
	//driver.findElement(By.linkText("Register")).click();
	driver.get("https://www.amazon.in");
}

@Test
public void testTitle() {
	
	Select select = new Select(driver.findElement(By.id("products-orderby")));
	List<WebElement> drop = select.getOptions();
	
drop.size();

  

}



}
