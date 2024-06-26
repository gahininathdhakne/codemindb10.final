package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import utility.CommonUtils;

public class BaseTest {
	
WebDriver driver;
SoftAssert verify;
	
	@BeforeMethod(alwaysRun = true)
	public void setup()
	{   
		verify = new SoftAssert();
		org.testng.Reporter.log("Before launching browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//driver.get(new CommonUtils().readProperty("url"));
		org.testng.Reporter.log("Browser launched successfully");
		Assert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
	}
	@AfterMethod(alwaysRun = true)
	public void tearDown()
	{
		verify.assertAll();
		driver.quit();
	}
}
