package Framework1.Fwk1.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver startBrowser(String op, WebDriver driver) {
		
		if(op.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe");
			driver= new ChromeDriver(); 
		}
		
		return driver; 
	}
}
