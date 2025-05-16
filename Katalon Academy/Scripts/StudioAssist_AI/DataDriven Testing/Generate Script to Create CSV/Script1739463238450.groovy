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
	 * The following is usecase that create CSV test data using StudioAssist AI
	 */

	/*
	 * 
	 * - Create a CSV named 'Data Files/data.csv' using java.io, listout libraries need to import
	 * - Add inot data.csv file with 3 columns: Facility, Visit_date, Comment with 5 rows that comply with the rules as follows:
	 * + 'Facility' must be one of the following values: 'Tokyo CURA Healthcare Center','Hongkong CURA Healthcare Center','Seoul CURA Healthcare Center'
	 * + 'Visit_Date' in dd/mm/yyyy format
	 * + 'Comment' is a sentence describeing issue regarding making appointment  
	 * 
	 */
import java.io.BufferedWriter // For writing text to a file
import java.io.File // For file handling
import java.io.FileWriter // For writing to a file
import java.io.IOException // For handling exceptions

// Create a CSV file with specified data
CustomKeywords.'createCSVFile'('Data Files/data.csv', [['Tokyo CURA Healthcare Center', '01/01/2023', 'I had trouble booking my appointment.'], 
                                                         ['Hongkong CURA Healthcare Center', '15/02/2023', 'The website was down when I tried to book.'], 
                                                         ['Seoul CURA Healthcare Center', '20/03/2023', 'I received no confirmation email.'], 
                                                         ['Tokyo CURA Healthcare Center', '05/04/2023', 'The appointment times were not available.'], 
                                                         ['Hongkong CURA Healthcare Center', '10/05/2023', 'I faced issues with the payment process.']])

@Keyword
/*
 *  Create a CSV file with specified data.
 *
 *  @param filePath The path where the CSV file will be created.
 *  @param data The list of rows to be added to the CSV file.
 *  @return None
 */
def createCSVFile(String filePath, List<List<String>> data) {
    File file = new File(filePath) // Create a new file object with the specified path
    BufferedWriter writer = null // Initialize writer to null
    try {
        writer = new BufferedWriter(new FileWriter(file)) // Create a BufferedWriter to write to the file
        // Write the header row
        writer.write('Facility,Visit_date,Comment\n') // Write the header for the CSV
        // Iterate through each row of data
        for (List<String> row : data) {
            writer.write(String.join(',', row) + '\n') // Write each row to the CSV
        }
    } catch (IOException e) {
        e.printStackTrace() // Print the stack trace in case of an exception
    } finally {
        if (writer != null) {
            writer.close() // Close the writer to release resources
        }
    }
}
