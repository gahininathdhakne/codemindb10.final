package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	WebDriver driver;
	@Given("launch application")
	public void launch_application()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/index.php");
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	@And("enter username")
	public void setUserName()
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
	}
	
	@And("enter password")
	public void setPassword()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	}
	
	@When("click on submit btn")
	public void clickOnSubmitBtn()
	{
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
	}
	
	@Then("verify is user successfully logged in")
	public void verifyUserLoggedIn()
	{
		String text = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
		Assert.assertEquals(text, "Login Successfully");
	//Assert.assertEquals(driver.findElements(By.xpath("//h3[text()='Login Successfully']")).getText, "Login Successfully");
	}
}
