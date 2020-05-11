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

WebUI.navigateToUrl('https://users.byjusorders.com/login')

WebUI.click(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Byjus UMS/button_Sign In With Google'))

WebUI.click(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Signin/button_Continue with Google'))

WebUI.setText(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Sign in  Google accounts/input_StagingByjusOrders_identifier'), 
    findTestData('Login').getValue('Email', 1))

WebUI.click(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Sign in  Google accounts/span_Next'))

WebUI.setText(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    findTestData('Login').getValue('Password', 1))

WebUI.click(findTestObject('UIOR/Page_Sign in  Google accounts/Password_Next'))

WebUI.click(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Byjus UMS/a_Employee Dashboard'))

WebUI.click(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Byjus UMS/a_Sales Employees'))

WebUI.click(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/Page_Byjus UMS/a_BDT'))

WebUI.click(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/BDT count'))

String BDT_Count = WebUI.getText(findTestObject('UIOR/UMS-Sales Employees Count/Page_Byjus UMS/BDT count'))

String[] Split_count = split(BDT_Count, ' ')

CustomKeywords.'customFunctions.WriteExcel.demoKey'(Split_count)



