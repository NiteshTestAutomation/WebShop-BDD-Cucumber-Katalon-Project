import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.PendingException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStepdefs {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@Given("User navigate to login page")
	def user_navigate_to_login_page() {
		
		WebUI.navigateToUrl('https://demowebshop.tricentis.com/')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/LoginPage Object Repository/Page_Demo Web Shop/a_Log in'))
		throw new PendingException();
	}

	@When("User enters valid (.*) and (.*)")
	def user_enters_valid_niteshbadge_yopmail_com_and_nitesh(String user, String pass) {

		WebUI.setText(findTestObject('Object Repository/LoginPage Object Repository/Page_Demo Web Shop. Login/input_Email_Email'),user)

		WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), pass)

		throw new PendingException();
	}

	@When("User click on login button")
	def user_click_on_login_button() {
		
		WebUI.click(findTestObject('Object Repository/LoginPage Object Repository/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))
		throw new PendingException();
	}

	@Then("User is navigated to homepage")
	def user_is_navigated_to_homepage() {

		String pageUrl = WebUI.getUrl()

		WebUI.verifyEqual(pageUrl,"https://demowebshop.tricentis.com/")
		throw new PendingException();
	}
}