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

WebUI.callTestCase(findTestCase('Profile/TC.PI.01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('profile/Page_SecondHand/click_profile'))

WebUI.sendKeys(findTestObject('profile/Page_SecondHand/Page_SecondHand/img2_'), 'C:\\Users\\aftar\\Downloads\\images.jpg')

WebUI.sendKeys(findTestObject('profile/Page_SecondHand/input_Nama'), 'Bunga')

WebUI.selectOptionByIndex(findTestObject('profile/Page_SecondHand/select_kota'), 4)

WebUI.sendKeys(findTestObject('profile/Page_SecondHand/input_alamat'), 'Jl. Dulu')

WebUI.sendKeys(findTestObject('profile/Page_SecondHand/input_No_Handphone'), '08333333')

WebUI.click(findTestObject('profile/Page_SecondHand/btn_simpan'))

