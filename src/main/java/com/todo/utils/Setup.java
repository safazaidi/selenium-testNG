package com.todo.utils;

import java.io.IOException;

import org.openqa.selenium.bidi.module.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Setup extends BasePage{

	public Setup() throws IOException {
		super();	
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setupTest(String Browser ) {
		initialization( Browser);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
