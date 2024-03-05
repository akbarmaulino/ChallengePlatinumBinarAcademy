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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.util.KeywordUtil



def driver = DriverFactory.getWebDriver()

def field_blank_email = driver.findElement(By.id('user_email'))


def message = WebUI.executeJavaScript('return arguments[0].validationMessage', Arrays.asList(field_blank_email))

def alert_id = "Silakan isi kolom ini."
def alert_en = "Please fill out this field."


if ((message==alert_id)||(message==alert_en)) {
	if(message == alert_id) {
		KeywordUtil.markPassed("Message Sudah Sesuai Menggunakan Bahasa Indonesia")
	}else if(message == alert_en) {
		KeywordUtil.markPassed("Message Sudah Sesuai Menggunakan Bahasa Inggris")
	}
	
}else {
	KeywordUtil.markFailed("Message Tidak Muncul")
}
