package fileUploadDownload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WgetFileUploadDownload {

	public static void main(String[] args) {
		System.setProperty("www.chrome.driver", "C:\\selenium-java-3.13.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          String baseUrl = "http://demo.guru99.com/test/yahoo.html";
  

  driver.get(baseUrl);
  WebElement downloadButton = driver.findElement(By
  .id("messenger-download"));
  String sourceLocation = downloadButton.getAttribute("href");
  String wget_command = "cmd /c C:\\Wget\\wget.exe -P Documents: --no-check-certificate " + sourceLocation;

  try {
  Process exec = Runtime.getRuntime().exec(wget_command);
  int exitVal = exec.waitFor();
  System.out.println("Exit value: " + exitVal);
  } catch (InterruptedException | IOException ex) {
  System.out.println(ex.toString());
  }
  driver.close();
	}

}
