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

Mobile.callTestCase(findTestCase('Login/login seller'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('seller/button jual'), 0)

Mobile.setText(findTestObject('seller/nama_produk'), 'gggg', 0)

Mobile.setText(findTestObject('seller/harga produk'), '870000', 0)

Mobile.selectListItemByIndex(findTestObject('seller/kategori'), 2, 0)

Mobile.setText(findTestObject('seller/lokasi'), 'jkt', 0)

Mobile.setText(findTestObject('seller/deskripsi'), 'iiiii', 0)

Mobile.sendKeys(findTestObject('seller/image'), 'C:\\Users\\aftar\\Downloads\\images.jpg')

Mobile.doubleTap(findTestObject('seller/terbitkan'), 0)

