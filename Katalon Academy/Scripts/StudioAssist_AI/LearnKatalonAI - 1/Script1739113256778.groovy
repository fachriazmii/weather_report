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
* Dibawah ini adalah test step untuk generate StudioAssit AI dengan membuat list dengan bhsIng 
*/

/*
* Write a katalon studio Test Case to perform the following step:
* 1. Open a browser ti the URL stored in the GlobalVariabel.G_SiteURL
* 2. Click the MakeAppointment button with the id 'Page_CURA Healthcare Service/Page_Homepage/btnMakeAppointment'
* 3. Fill the username id 'Page_CURA Healthcare Service/Page_Login/txtUsername' with local variable 'Username'
* 4. Fill the password id 'Page_CURA Healthcare Service/Page_Login/txtPassword'with local variable 'Password'
* 5. Click login button id 'Page_CURA Healthcare Service/Page_Login/btnnLogin'
* 6. Verify the appointment div 'Page_CURA Healthcare Service/Page_BookAppointment/divMakeAppointment' exist with timeout 10s
* 7. Close the browser
*/
// Open a browser to the URL stored in the GlobalVariable.G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the MakeAppointment button
WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_Homepage/btnMakeAppointment'))

// Fill the username with local variable 'Username'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_Login/txtUsername'), Username)

// Fill the password with local variable 'Password'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_Login/txtPassword'), Password)

// Click the login button
WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_Login/btnnLogin'))

// Verify the appointment div exists with timeout 10s
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/divMakeAppointment'), 10)

// Close the browser
WebUI.closeBrowser()





