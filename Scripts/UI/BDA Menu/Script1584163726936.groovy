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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://achieve.byjusorders.com/login')

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/svg_Sign in_MuiSvgIcon-root'))

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Signin/button_Continue with Google'))

WebUI.setText(findTestObject('UIOR/BDA- Menu/Page_Sign in  Google accounts/input_StagingByjusOrders_identifier'), 
    'deepa.reddy@byjus.com')

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Sign in  Google accounts/span_Next'))

WebUI.setEncryptedText(findTestObject('UIOR/BDA- Menu/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    'BUx3PHDWzMTNI2WfZ9e2VQ==')

WebUI.sendKeys(findTestObject('UIOR/BDA- Menu/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/svg_D_MuiSvgIcon-root'))

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Impersonate'))

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/div_Email'))

WebUI.setText(findTestObject('UIOR/BDA- Menu/Page_Achieve/input_Email_email'), 'dhruv.chadha@byjus.com')

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Impersonate'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Summary'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Summary'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Orders'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Orders'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/span_Unprocessed orders'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Unprocessed orders'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/span_Processed orders'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Processed orders'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/span_Conduction'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Conduction'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/span_Inventory'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Inventory'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/span_Cashbacks'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Cashbacks'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/span_Talktime'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Talktime'))

not_run: WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/a_List'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_List'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Escalations'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Escalations'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_SCRs or ICRs'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_SCRs or ICRs'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Attendance Portal'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_Attendance Portal'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_View Attendance'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_View Attendance'))

WebUI.verifyElementPresent(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_OLA commute history'), 5)

WebUI.click(findTestObject('UIOR/BDA- Menu/Page_Achieve/span_OLA commute history'))

WebUI.closeBrowser()

