package test.test_art;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testing()
    {
    	System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("http://www.google.com");
    }
    
	
}
