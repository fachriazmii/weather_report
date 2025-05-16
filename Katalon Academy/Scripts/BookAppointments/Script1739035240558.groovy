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

WebUI.openBrowser('')

CustomKeywords.'example.MyKeyword.AppLogin'()

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/ddHealthcareCenter'), 1)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/cbreadmission'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/cbMedicare'))

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/cbMedicaid'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/cbNone'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/txtVisitDate'), '11/02/2025')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/txtComment'), 'testing katalon academy')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/btnBookAppointment2'))

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/h2AppointmentConfirmation'), 3)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/Page_BookAppointment/btnGotoHomepage'))

    CustomKeywords.'example.MyKeyword.Congrats'('Fahri')
}

WebUI.closeBrowser()

