package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotersTest 

{
@Test(groups = "system")
public void tata()
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://cars.tatamotors.com/safari/");
Reporter.log("tata motors launched successfully",true );

}
}
