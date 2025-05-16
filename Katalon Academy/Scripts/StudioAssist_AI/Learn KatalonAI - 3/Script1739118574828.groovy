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
 * Step dibawah ini merupakan contoh untuk menggunakan StudioAssst AI dengan memanggil script lain
 *  
 */

/*
 * I have list of object:
 * -Options: 'Page_CURA Healthcare Service/Page_BookAppointment/select_Seoul CURA Healthcare Center'
 * -Health Program: 'Page_CURA Healthcare Service/Page_BookAppointment/cbMedicare'
 * -Date: 'Page_CURA Healthcare Service/Page_BookAppointment/txtVisitDate'
 * -Comment: 'Page_CURA Healthcare Service/Page_BookAppointment/txtComment'
 * -Make Appointment button: 'Page_CURA Healthcare Service/Page_BookAppointment/btnBookAppointment2'
 * 
 * Write me a script to perform the steps as follows:
 * 1. Find and call a 'StudioAssist_AI/Reusable Test/Login' test case with the variable 'Username' set as 'John Doe' and 'Password' as the local variable in Login
 * 2. Select The Option as select 'Seoul CURA Healthcare Center' and the label is not regex
 * 3. Check the health program
 * 4. Set the date to '11/02/2025'
 * 5. Write 'Happy Birthday Fahri' asap on comment
 * 6. Capture the screenshot of the page
 * 6. Submit the appointment
 * 7. Capture the screenshot of the page
 * 8. Close the browser

*/
// Step 1: Call the 'Login' test case with specified parameters
WebUI.callTestCase(findTestCase('StudioAssist_AI/Reusable Test/Login'), 
    [('Username') : 'John Doe', ('Password') : Password], FailureHandling.STOP_ON_FAILURE)

// Step 2: Select the option 'Seoul CURA Healthcare Center'
WebUI.selectOptionByLabel(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/select_Seoul CURA Healthcare Center'), 
    'Seoul CURA Healthcare Center', false)

// Step 3: Check the health program
WebUI.check(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/cbMedicare'))

// Step 4: Set the date to '11/02/2025'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/txtVisitDate'), 
    '11/02/2025')

// Step 5: Write 'Happy Birthday Fahri' on comment
WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/txtComment'), 
    'Happy Birthday Fahri')

// Step 6: Capture the screenshot of the page
WebUI.takeScreenshot()

// Step 7: Submit the appointment
WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/btnBookAppointment2'))

// Step 8: Capture the screenshot of the page after submission
WebUI.takeScreenshot()

// Step 9: Close the browser
WebUI.closeBrowser()




