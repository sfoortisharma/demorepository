package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CopyOfdemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.24.0-win64//geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
		@SuppressWarnings("deprecation")
		WebDriver driver= new FirefoxDriver(capabilities);
		//driver.get("google.com");

	}

}
