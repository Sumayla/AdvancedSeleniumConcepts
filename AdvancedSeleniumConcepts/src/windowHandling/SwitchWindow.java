package windowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
		//driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		//window handlin
	
		
		String mainwindow=driver.getWindowHandle();
		
		Set<String> S= driver.getWindowHandles();
		Iterator<String> itr= S.iterator();
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			
			if(!mainwindow.equalsIgnoreCase(childwindow))
				{driver.switchTo().window(childwindow);

            
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='emailid']")));
			element.sendKeys("sumaylakhan@gmail.com");
			
			 driver.close();}
		}
		
		driver.switchTo().window(mainwindow);
		
	}

}
