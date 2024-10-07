package org.step;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("user is on the facebook login page")
	public void user_is_on_the_facebook_login_page() {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://www.facebook.com/");
		implicitWait(30);
	}

//	@When("user enters the username and password")
//	public void user_enters_the_username_and_password() {
//		WebElement txtUserName = findLocatorById("email");
//		elementSendKeys(txtUserName, "java");
//		WebElement txtPassword = findLocatorById("pass");
//		elementSendKeys(txtPassword, "password");
//	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {

		WebElement btnLogin = findLocatorByName("login");
		elementClick(btnLogin);

	}

	@Then("user verify the after login success message")
	public void user_verify_the_after_login_success_message() {
		Assert.assertTrue(true);
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String user, String pass) {
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, user);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, pass);
	}
	
	
	


	@Given("user is on the amazon login page")
	public void user_is_on_the_amazon_login_page() {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://www.amazon.com/");
		implicitWait(30);
	}
	
	@When("user enters the {string} and {string} in amazon web")
	public void user_enters_the_credentials(String user, String pass) {
		
		WebElement signIn = findLocatorById("nav-link-accountList-nav-line-1");
		elementClick(signIn);
		
		WebElement txtUserName = findLocatorById("ap_email");
		elementSendKeys(txtUserName, user);
		WebElement btnCont = findLocatorById("continue");
		elementClick(btnCont);
		
		WebElement txtPassword = findLocatorById("ap_password");
		elementSendKeys(txtPassword, pass);
		
		
	}

	@When("user clicks on the login button in amazon")
	public void user_clicks_on_the_login_button_in_amazon() {
		WebElement BtnSubmit = findLocatorById("signInSubmit");
		elementClick(BtnSubmit);
	}
	@Then("user verify the after login success message in amazon")
	public void user_verify_the_after_login_success_message_in_amazon() {
		
	}




}
