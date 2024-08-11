package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KawasakiNinjaTest 
{
@Test(groups = "regression")
public void kawasaki()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://kawasaki-india.com/");
	Reporter.log("kawaski class executed ",true );
}
}
