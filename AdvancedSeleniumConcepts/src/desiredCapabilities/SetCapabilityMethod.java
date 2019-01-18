package desiredCapabilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetCapabilityMethod {

	public static void main(String[] args) {

		//it is used to define IE capability 	
		DesiredCapabilities capabilities =  DesiredCapabilities.internetExplorer();
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		//it is used to initialize the IE driver
		System.setProperty("www.internetexplorer.driver", "C:\\selenium-java-3.13.0\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://gmail.com");
        driver.quit();
		
	}

}
