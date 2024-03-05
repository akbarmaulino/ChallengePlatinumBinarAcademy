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
import java.util.Random as Random
import java.util.Collections as Collections
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.util.KeywordUtil

AppiumDriver driver = MobileDriverFactory.getDriver()
def Actual_ToastMessage = driver.findElementByXPath('//hierarchy/android.widget.Toast[1]').getText()

def Expected_ToastMessage ='Email sudah digunakan'

if ((Actual_ToastMessage==Expected_ToastMessage)){
		KeywordUtil.markPassed('Message Muncul Dengan Pesan "Email Sudah Digunakan"')
		println(Actual_ToastMessage)
} else {
	KeywordUtil.markFailed('Message Tidak Muncul')
}

//
//
//
//
//def driver = MobileDriverFactory.getDriver()
//
////def field_wrong_format_email = MobileBuiltInKeywords.findMobileElement()
//def inputEmailObject = findTestObject('Daftar Page/Input_Email')
//
//// Find the mobile element
//def element = MobileBuiltInKeywords.findMobileElement(inputEmailObject)
//// Dapatkan MobileTestObject
//TestObject  inputEmailObject = findTestObject('Daftar Page/Input_Email')
//
//// Temukan elemen seluler
//def element = MobileBuiltInKeywords.findMobileElement(inputEmailObject)
//
//
//def message = MobileBuiltInKeywords.executeJavaScript("return arguments[0].validationMessage", Arrays.asList(inputEmailObject))
//
//def  myField = findTestObject('Registration Page/Field_input_Email')
//def isiField = mobile.getAttribute(myField, 'value')
//def alert_id = "Harap sertakan '@' di alamat email. '" + isiField + "' tidak ada '@'."
//def alert_en = "Please include an '@' in the email address. '" + isiField + "' is missing an '@'."
//println(message)
//
//
//if ((message==alert_id)||(message==alert_en)) {
//	if(message == alert_id) {
//		KeywordUtil.markPassed("Message Sudah Sesuai Menggunakan Bahasa Indonesia")
//	}else if(message == alert_en) {
//		KeywordUtil.markPassed("Message Sudah Sesuai Menggunakan Bahasa Inggris")
//	}
//	
//}else {
//	KeywordUtil.markFailed("Message Tidak Muncul")
//}