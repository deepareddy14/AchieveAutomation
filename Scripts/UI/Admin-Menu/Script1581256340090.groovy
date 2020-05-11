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

WebUI.callTestCase(findTestCase('UI/Achieve-Login'), [('Email') : findTestData('Login').getValue(1, 1), ('Password') : findTestData(
            'Login').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Summary'), 0)

WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Summary'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/button_Weekly Summary'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/button_Weekly Summary'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Product Details'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Product Details'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Cohort Analysis'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Cohort Analysis'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_BDA Performance'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_BDA Performance'))

WebUI.verifyElementPresent(findTestObject('UIOR/LHS Menu/Menu/span_Orders'), 0)

WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Orders'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Conduction'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Conduction'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Inventory'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Inventory'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Cashbacks'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Cashbacks'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Talktime'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Talktime'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Escalations'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Escalations'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_SCRs or ICRs'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_SCRs or ICRs'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_Attendance Portal'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_Attendance Portal'))

WebUI.verifyElementPresent(findTestObject('UIOR/Page_Achieve/span_OLA commute history'), 0)

WebUI.click(findTestObject('UIOR/Page_Achieve/span_OLA commute history'))

