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

Mobile.callTestCase(findTestCase('Initiate/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Initiate/Go To Registration Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('User Registration/Input Name'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('User Registration/Input Email'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('User Registration/Input Password'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Initiate/View Icon Password'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('User Registration/Input Nomor Handphone'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('User Registration/Input Kota'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('User Registration/Input Alamat'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Initiate/Submit Registration'), [:], FailureHandling.STOP_ON_FAILURE)

