package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfieldTest 
{
@Test (groups = "integration")
public void royal()
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.royalenfield.com/in/");
	Reporter.log("royal enfield class bikes executed ",true);
}
}
