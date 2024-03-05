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

WebUI.callTestCase(findTestCase('Step Definition Login/Login/login seller'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('jual/Page_SecondHand/bullet_navigator'))

WebUI.navigateToUrl('https://secondhand.binaracademy.org/products/80767')

WebUI.click(findTestObject('jual/Page_SecondHand/a_Edit'))

WebUI.clearText(findTestObject('jual/input_nama'))

WebUI.sendKeys(findTestObject('jual/input_nama'), 'aaa')

WebUI.clearText(findTestObject('jual/input_harga'))

WebUI.sendKeys(findTestObject('jual/input_harga'), '22222')

WebUI.selectOptionByIndex(findTestObject('jual/kategori'), 2)

WebUI.clearText(findTestObject('jual/deskripsi'))

WebUI.sendKeys(findTestObject('jual/deskripsi'), 'aaaaaaa')

WebUI.click(findTestObject('jual/Page_SecondHand/button_close_img'))

WebUI.sendKeys(findTestObject('jual/img'), 'C:\\Users\\aftar\\Downloads\\siblack.png')

WebUI.click(findTestObject('jual/label_Terbitkan'))

