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

WebUI.callTestCase(findTestCase('Step Definition Login/Login/login buyer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('buyer/nuuu_produck/neuu/Page_SecondHand/Page_SecondHand/Page_SecondHand/Page_SecondHand/div_halow      Kendaraan'), 
    0)

WebUI.verifyElementClickable(findTestObject('buyer/nuuu_produck/neuu/Page_SecondHand/div_halow      Kendaraan      Rp 23.000'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://secondhand.binaracademy.org/products/82064')

WebUI.click(findTestObject('buyer/negosiasi/try_nego3/button_Saya tertarik dan ingin nego'))

WebUI.sendKeys(findTestObject('buyer/negosiasi/try_nego3/input_Harga Tawar_offerprice'), '60000000000000000000000000000000')

WebUI.click(findTestObject('buyer/negosiasi/try_nego3/button_kirim'))

