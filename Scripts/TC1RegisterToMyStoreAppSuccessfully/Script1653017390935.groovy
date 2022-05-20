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

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'test@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Create an accountPlease enter your emai_fbee79'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'evitesting2@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mrs_id_gender'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Gania')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'Anwar')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20222021202020192018201720162015201_66c453'), 
    '1987', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'Vox Teneo')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'Melati Street, Kamboha Region')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'Apartment Dahlia 4th floor')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Chicago')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), '08765432109')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '08987654321')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__alias'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My account - My Store/p_Welcome to your account. Here you can man_a77dad'))

WebUI.closeBrowser()

