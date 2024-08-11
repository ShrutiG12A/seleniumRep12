package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkillrarayAssignmentTest
{
	@Test
	public void logindata()
	{
		String url = System.getProperty("url");
		String email=System.getProperty("email");
		String password = System.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("last")).click();
		Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce","login page is not displayed ");
		Reporter.log("homepage is not displayed ");
		
	}
}

