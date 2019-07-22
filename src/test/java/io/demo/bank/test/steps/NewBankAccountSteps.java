package io.demo.bank.test.steps;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.demo.bank.test.pageobject.HomePage;
import io.demo.bank.test.pageobject.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class NewBankAccountSteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9217777745579627128L;
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Step ("Open Browser and Navigate to Login Page")
	public void navigateToLoginPage () {
		loginPage.open();
	}
	
	@Step ("Enter Username '{0}' into the Username field")
	public void enterUsername (String username) {
		loginPage.enterUsername(username);
	}
	
	@Step ("Enter Password '{0}' into the Password field")
	public void enterPassword (String password) {
		loginPage.enterPassword(password);
	}
	
	@Step ("Check the Remember Me checkox")
	public void clickRememberMe () {
		loginPage.clickRememberMe();
	}
	
	@Step ("Click the Submit button")
	public void clickSubmit () {
		loginPage.clickSubmit();
	}
	
	@Step ("Authenticated User is expected to redirect the browser to the Home page")
	public void redirectedToHomePage() {
		assertTrue (homePage.atHomePage());
	}
	
	@Step ("Assert the User is presented an Error Message for Failed Authentication")
	public void presentedErrorMessage() {
		assertTrue (loginPage.errorMessagePresent());
	}
	
	@Step ("Assert the Remember Me cookie is present")
	public void remeberMeCookiePresent() {
		assertTrue (loginPage.cookiePresent());
	}
	
	@Step ("Assert the Remember Me cookie is not present")
	public void remeberMeCookieNotPresent() {
		assertFalse (loginPage.cookiePresent());
	}
	
	@Step ("Assert the '{0}' field contains value '{0}'")
	public void assertFieldContainsValue(String field, String value) {
		assertTrue (true);
	}
	
	public void enterValidUsername() {
		// TODO Auto-generated method stub
		
	}

	public void enterMatchingPassword() {
		// TODO Auto-generated method stub
		
	}

	public void enterValidUsernameAndPassword() {
		// TODO Auto-generated method stub
		
	}

	public void clickOpenNewAccount() {
		// TODO Auto-generated method stub
		
	}

	public void enterInitialBalance(int initialBal) {
		// TODO Auto-generated method stub
		
	}

	public void clickAcceptTermsCheckbox() {
		// TODO Auto-generated method stub
		
	}

	public void clickSubmitApplication() {
		// TODO Auto-generated method stub
		
	}

	public void verifyNewAccountVisible() {
		// TODO Auto-generated method stub
		
	}

	public void selectCheckingAccountFromDropdown() {
		// TODO Auto-generated method stub
		
	}

	public void selectNewAccount() {
		// TODO Auto-generated method stub
		
	}

	public void verifyInitialBalance(int expectedBal) {
		// TODO Auto-generated method stub
		
	}

	public void selectNewestAccount() {
		// TODO Auto-generated method stub
		
	}


}
