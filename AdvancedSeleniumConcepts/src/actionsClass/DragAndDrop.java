package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("http://demo.guru99.com/test/drag_drop.html" );
		WebElement from=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(from, to).build().perform();
	    action.dragAndDropBy(from, 135, 40);
	    
		
		
		

	}

}
