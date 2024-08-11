package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RangeRoverTest
{
@Test (groups = "smoke")
public void range()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.landrover.in/range-rover/range-rover");
	Reporter.log("range rover launched successfully",true );
}
}
