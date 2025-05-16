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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.doubleClick(findTestObject('Object Repository/Page_Tugas Akhir  Log in/input_Log_username'))

WebUI.setText(findTestObject('Object Repository/Page_Tugas Akhir  Log in/input_Log_username'), 'admin')

WebUI.doubleClick(findTestObject('Object Repository/Page_Tugas Akhir  Log in/input_Log_username'))

WebUI.setText(findTestObject('Object Repository/Page_Tugas Akhir  Log in/input_Log_username'), 'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Tugas Akhir  Log in/input_Log_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Tugas Akhir  Log in/input_Log_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Dashboard/a_Dosen'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Dosen/a_Mahasiswa'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Mahasiswa/p_Monitoring'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Mahasiswa/p_Mahasiswa Judul'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Mahasiswa Judul/a_Akun'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Mahasiswa Judul/a_Akun Mahasiswa'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Akun Mahasiswa/button_Approve Akun'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Tugas Akhir  Akun Mahasiswa/button_Approve Akun'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Akun Mahasiswa/button_Approve Akun'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Akun Mahasiswa/button_Approve Akun'))

WebUI.click(findTestObject('Object Repository/Page_Tugas Akhir  Akun Mahasiswa/p_Log out'))

WebUI.closeBrowser()

