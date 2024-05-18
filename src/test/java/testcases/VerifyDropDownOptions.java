package testcases;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.CommonUtils;

public class VerifyDropDownOptions extends BaseTest{
	
	HomePage homePage;
	@Test(description ="verify drop down options", enabled = true, groups = {"sanity"}, priority =1)
		public void verifyDropdownOptions()
	{
		homePage = new HomePage(driver);
		WebElement getOlderNewsletterDropdown = homePage.getOlderNewslettersDropdown();
		List<String> expectedDropdownOptions = Arrays.asList("Older NewsLetters","doc 1", "doc 2", "doc 3", "doc 4");
		List<String> allDropDownOptions = CommonUtils.getAllOptionsFromDropdown(getOlderNewsletterDropdown);
		verify.assertEquals(allDropDownOptions, expectedDropdownOptions,"dropdown not having mentioned options");
		verify.assertAll();
	}
}
