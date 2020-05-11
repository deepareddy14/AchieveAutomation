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

WebUI.callTestCase(findTestCase('UI/Achieve-Login'), [('Email') : findTestData('Login').getValue(1, 1), ('Password') : findTestData(
            'Login').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

for (def row = 1; row <= findTestData('BDA LIST').getRowNumbers(); row++) {
    Totalrows = findTestData('BDA LIST')

    println(Totalrows)

    WebUI.click(findTestObject('UIOR/Page_Achieve/svg_D_MuiSvgIcon-root'))

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_Impersonate'))

    WebUI.setText(findTestObject('UIOR/Page_Achieve/input_Email_email'), findTestData('BDA LIST').getValue('BDA\'s', row))

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_Impersonate'))

    WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Orders'))

    WebUI.click(findTestObject('UIOR/LHS Menu/Menu/a_Unprocessed orders'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)

    WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Conduction'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)

    WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Inventory'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)

    WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Cashbacks'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)
	
    WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Talktime'))

    WebUI.click(findTestObject('UIOR/Page_Achieve/a_List'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)

    WebUI.click(findTestObject('UIOR/LHS Menu/Menu/span_Escalations'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_SCRs or ICRs'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_OLA commute history'))

    WebUI.verifyElementNotPresent(findTestObject('UIOR/Role Filter Objects/Page_Achieve/input_Reporter_mui-autocomplete-90997'), 
        10)

    WebUI.waitForElementClickable(findTestObject('UIOR/Page_Achieve/button_S_MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit'), 
        30)

    WebUI.click(findTestObject('UIOR/Page_Achieve/button_S_MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit'))

    WebUI.click(findTestObject('UIOR/Page_Achieve/span_Unmask Impersonate'))
}

