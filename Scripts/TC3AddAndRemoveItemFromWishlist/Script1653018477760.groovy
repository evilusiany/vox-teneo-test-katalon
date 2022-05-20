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

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My wishlists'))

WebUI.click(findTestObject('Object Repository/Page_My Store/li_Printed Chiffon Dress                   _ec0d38'))

WebUI.click(findTestObject('Object Repository/Page_My Store/img_Top sellers_replace-2x img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Printed Chiffon Dress - My Store/a_Add to wishlist'))

WebUI.click(findTestObject('Object Repository/Page_Printed Chiffon Dress - My Store/a_supportseleniumframework.com_fancybox-ite_61b443'))

WebUI.click(findTestObject('Object Repository/Page_Printed Chiffon Dress - My Store/span_Gania Anwar'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My wishlists'))

WebUI.click(findTestObject('Object Repository/Page_My Store/td_View_wishlist_delete'))

WebUI.click(findTestObject('Object Repository/Page_My Store/i_View_icon-remove'))

WebUI.click(findTestObject('Object Repository/Page_My Store/td_View_wishlist_delete'))

WebUI.click(findTestObject('Object Repository/Page_My Store/th_Delete'))

WebUI.click(findTestObject('Object Repository/Page_My Store/i_View_icon-remove'))

WebUI.click(findTestObject('Object Repository/Page_My Store/td_View'))

WebUI.click(findTestObject('Object Repository/Page_My Store/a_View'))

WebUI.click(findTestObject('Object Repository/Page_My Store/i_View_icon-remove'))

WebUI.click(findTestObject('Object Repository/Page_My Store/i_View_icon-remove'))

WebUI.click(findTestObject('Object Repository/Page_My Store/i_View_icon-remove'))

WebUI.click(findTestObject('Object Repository/Page_My Store/img_Send this wishlist_replace-2x img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Printed Chiffon Dress - My Store/span_Gania Anwar'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My wishlists'))

WebUI.click(findTestObject('Object Repository/Page_My Store/i_View_icon-remove'))

WebUI.click(findTestObject('Object Repository/Page_My Store/td_View_wishlist_delete'))

WebUI.closeBrowser()

