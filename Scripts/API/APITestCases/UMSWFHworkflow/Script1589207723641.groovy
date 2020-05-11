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

response = WS.sendRequest(findTestObject('API/UMSwfhattendanceworkflow'))

WS.verifyElementPropertyValue(response, 'docs[0].meetingAttendanceStatus', 'meeting_attendance_marking_open')
WS.verifyElementPropertyValue(response, 'docs[0].uploadTalktimeStatus', '')
WS.verifyElementPropertyValue(response, 'docs[0].managerDisputeStatus', '')
WS.verifyElementPropertyValue(response, 'docs[0].bdaDisputeStatus', '')

WS.verifyElementPropertyValue(response, 'docs[1].meetingAttendanceStatus', 'meeting_attendance_marking_completed')
WS.verifyElementPropertyValue(response, 'docs[1].uploadTalktimeStatus', 'upload_talktime_completed')
WS.verifyElementPropertyValue(response, 'docs[1].managerDisputeStatus', 'manager_dispute_open')
WS.verifyElementPropertyValue(response, 'docs[1].bdaDisputeStatus', '')

WS.verifyElementPropertyValue(response, 'docs[2].meetingAttendanceStatus', 'meeting_attendance_marking_completed')
WS.verifyElementPropertyValue(response, 'docs[2].uploadTalktimeStatus', 'upload_talktime_completed')
WS.verifyElementPropertyValue(response, 'docs[2].managerDisputeStatus', 'manager_dispute_completed')
WS.verifyElementPropertyValue(response, 'docs[2].bdaDisputeStatus', 'bda_dispute_open')

