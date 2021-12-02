package com.scuba.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions
{

	@Test
	public void testCaseVerifyHomePage() 
	{
		driver= new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
		Assert.assertTrue(isUserLoggedInSuccessfully(), "User failed to login");
		Assert.assertFalse(isUserLoggedOut())
		}
}

