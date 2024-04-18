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

WebUI.navigateToUrl('http://10.222.56.204:8080/realms/stepi/protocol/openid-connect/auth?client_id=angular-client&redirect_uri=http%3A%2F%2F10.222.56.204%3A30020%2F&state=7d437683-f260-4d74-81ce-32118be6115c&response_mode=fragment&response_type=code&scope=openid&nonce=3bc45184-d8f6-477e-9641-0c0849a806b7')

WebUI.setText(findTestObject('Object Repository/Login/Page_Sign in to STEPI/input_Username or email_username'), 'user_aj_a')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Sign in to STEPI/input_Password_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Login/Page_Sign in to STEPI/input_Password_login'))

WebUI.verifyAlertNotPresent(0)

WebUI.closeBrowser()

