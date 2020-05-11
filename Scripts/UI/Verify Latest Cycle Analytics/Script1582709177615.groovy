import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

WebUI.openBrowser('')

WebUI.navigateToUrl('https://achieve.byjusorders.com/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Sign in'))

WebUI.click(findTestObject('UIOR/Page_Signin/button_Continue with Google'))

WebUI.setText(findTestObject('UIOR/Page_Sign in  Google accounts/input_StagingByjusOrders_identifier'), findTestData(
        'Login').getValue('Email', 1))

WebUI.click(findTestObject('UIOR/Page_Sign in  Google accounts/Email_Next'))

WebUI.setText(findTestObject('UIOR/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    findTestData('Login').getValue('Password', 1))

WebUI.click(findTestObject('UIOR/Page_Sign in  Google accounts/Password_Next'))

for (def row = 1; row <= findTestData('ImpersonateUsers').getRowNumbers(); row++) {
    Totalrows = findTestData('ImpersonateUsers').getRowNumbers()

    print(Totalrows)

    WebUI.click(findTestObject('UIOR/Page_Achieve/svg_D_MuiSvgIcon-root'))

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_Impersonate'))

    WebUI.setText(findTestObject('UIOR/Page_Achieve/input_Email_email'), findTestData('ImpersonateUsers').getValue('ImpersonateEmail', 
            row))

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_Impersonate'))

    not_run: WebUI.click(findTestObject('UIOR/Page_Achieve/td_WEEK8 (Feb20-Feb26  2020)'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyTextPresent('WEEK8*', true, FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('UIOR/Page_Achieve/button_S_MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit'), 
        30)

    WebUI.click(findTestObject('UIOR/Page_Achieve/button_S_MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit'))

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_Unmask Impersonate'))
}