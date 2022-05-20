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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), 'evitesting2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My addresses'))

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/span_Add a new address'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__firstname'), 'Dinda')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__lastname'), 'Azani')

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/input_Company_company'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__address1'), 'Fox Street, Lion Region')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input_Address (Line 2)_address2'), 'Tall Building, ground floor')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__city'), 'New York')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Address - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '30', true)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__postcode'), '34567')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone'), '089988776655')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone_mobile'), '087766554433')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__alias'), 'My office')

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/i_Save_icon-chevron-right right'))

WebUI.closeBrowser()

