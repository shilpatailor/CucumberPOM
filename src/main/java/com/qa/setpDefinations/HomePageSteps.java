package com.qa.setpDefinations;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class HomePageSteps extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
	    TestBase.intialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		loginPage = new LoginPage();
	    String title = loginPage.validateLoginPageTitle();
	    //Assert.assertEquals("Free CRM  - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user logs into app$")
	public void user_logs_into_app() {
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate Home page title$")
	public void validate_Home_page_title() {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homeTitle);
	}
/*
	@Then("^validate logged in username$")
	public void validate_logged_in_username() {
	    boolean flag = homePage.verifyCorrectUserName();
	    Assert.assertTrue(flag);
	}  */

}
