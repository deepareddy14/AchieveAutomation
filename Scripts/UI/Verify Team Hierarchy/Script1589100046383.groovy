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

WebUI.callTestCase(findTestCase('UI/Login and Impersonate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('UIOR/Page_Achieve/svg_S_MuiSvgIcon-root'), 30)

WebUI.click(findTestObject('UIOR/Page_Achieve/svg_S_MuiSvgIcon-root'))

WebUI.click(findTestObject('UIOR/Page_Achieve/li_Team Hierarchy'))

WebUI.click(findTestObject('UIOR/Page_Achieve/span_BDA'))

WebUI.click(findTestObject('UIOR/Page_Achieve/p_1-10 of 13'))

String BDACount = WebUI.getText(findTestObject('UIOR/Page_Achieve/p_1-10 of 13'))

WS.sendRequest(findTestObject(null), FailureHandling.STOP_ON_FAILURE)

