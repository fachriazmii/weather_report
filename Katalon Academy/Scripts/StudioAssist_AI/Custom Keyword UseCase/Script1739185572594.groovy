import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/**
	 * Dibawah ini adalah script untuk generate customkeyword dengan bantuan StudioAssist AI
	 * 
	 */
/*
	 * Make me a scrit for the following step:
	 * 1. Open the browser to the GlobalVariable.G_SiteURL URL
	 * 2. Click the 'Page_CURA Healthcare Service/Page_Homepage/btnMakeAppointment' button using 'example.CustomKeywordLearn.clickElement' (String testObjectId) Custom Keyword
	 * 3. Set The Userame object 'Page_CURA Healthcare Service/Page_Login/txtUsername' with 'Username' using local variable
	 * 4. Set The Password object 'Page_CURA Healthcare Service/Page_Login/txtPassword' with 'Password' using local variable
	 * 5. Click the 'Page_CURA Healthcare Service/Page_Login/btnnLogin' button with same 'clickElement' custom keyword 
	 * in step 2
	 * 6. Verify the page 'Page_CURA Healthcare Service/Page_BookAppointment/divMakeAppointment' element is present with 10 sec timeout
	 * 7. Close the browser
	 * 
	 */

// Open the browser to the specified URL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the 'Make Appointment' button using the custom keyword
CustomKeywords.'example.CustomKeywordLearn.clickElement'('Page_CURA Healthcare Service/Page_Homepage/btnMakeAppointment')

// Set the Username field with the local variable 'Username'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_Login/txtUsername'), Username)

// Set the Password field with the local variable 'Password'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_Login/txtPassword'), Password)

// Click the 'Login' button using the same custom keyword
CustomKeywords.'example.CustomKeywordLearn.clickElement'('Page_CURA Healthcare Service/Page_Login/btnnLogin')

// Verify the 'Make Appointment' element is present with a 10-second timeout
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/divMakeAppointment'), 10)

// Close the browser
WebUI.closeBrowser()

