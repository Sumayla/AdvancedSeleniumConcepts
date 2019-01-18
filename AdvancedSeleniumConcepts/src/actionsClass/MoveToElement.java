package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
						
        driver.get("https://www.facebook.com/");		
       WebElement element= driver.findElement(By.name("firstname"));
       
       Actions action = new Actions(driver);
       action.moveToElement(element).click().keyDown(element, Keys.SHIFT).sendKeys(element, "sumayla").keyUp(element, Keys.SHIFT)
       .doubleClick(element).contextClick().build().perform();
       
       //action.keyDown(element, Keys.SHIFT) will write sumayla in uppercase
       //action.doubleClick() will highlisght the element
        
	}

}
