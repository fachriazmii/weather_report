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
 *Diwbawah ini adalah list untuk generate studioassist AI dengan memisahkan object dan variabel dengan action

 */


/*
 * I have list of test object as below:
 * - Make appointment and click button: Page_CURA Healthcare Service/Page_Homepage/btnMakeAppointment
 * - Username: Page_CURA Healthcare Service/Page_Login/txtUsername
 * - Password: Page_CURA Healthcare Service/Page_Login/txtPassword
 * - Login button: Page_CURA Healthcare Service/Page_Login/btnnLogin
 * - Appointment div element: Page_CURA Healthcare Service/Page_BookAppointment/divMakeAppointment
 * - Close
 * 
 * I also have URL: GlobalVariabel.G_SiteURL, and also have two local variables: 'Username' and 'Password'
 * 
 * write me a test case that following this step:
 * 1. Open the browser that stored in G_SiteURL
 * 2. Click the Make appointment button
 * 3. Fill in the Username and Password based on the variables
 * 4. CLick the login button
 * 5. Verify the appointment div exist with timeout 10s
 * 6. Close the browser
 */
// Open the browser with the URL stored in G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the Make appointment button
WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_Homepage/btnMakeAppointment'))

// Fill in the Username based on the variable
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_Login/txtUsername'), Username)

// Fill in the Password based on the variable
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_Login/txtPassword'), Password)

// Click the login button
WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_Login/btnnLogin'))

// Verify the appointment div exists with a timeout of 10 seconds
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/divMakeAppointment'), 10)

// Close the browser
WebUI.closeBrowser()

