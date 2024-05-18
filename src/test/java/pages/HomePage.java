package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
WebDriver driver;
WebElement OlderNewslettersDropdown;
WebElement multiSelectDropdown;
WebElement orangeCheckbox;
	
	public HomePage(WebDriver driver)
	{   super(driver);
		this.driver=driver;
		
	}
	public WebElement getOlderNewslettersDropdown()
	{
		setOlderNewslettersDropdown();
		return OlderNewslettersDropdown;
	}
	public void setOlderNewslettersDropdown()
	{
		this.OlderNewslettersDropdown = driver.findElement(By.cssSelector("select#drop1"));
	}
	public WebElement getMultiSelectDropdown() {
		setMultiSelectDropdown();
		return multiSelectDropdown;
	}
	public void setMultiSelectDropdown() {
		this.multiSelectDropdown = driver.findElement(By.cssSelector("select#multiselect1"));
	}
	public WebElement getOrangeCheckbox() {
		setOrangeCheckbox();
		return orangeCheckbox;
	}
	public void setOrangeCheckbox() {
		this.orangeCheckbox = driver.findElement(By.cssSelector("#checkbox1"));
	}
}
