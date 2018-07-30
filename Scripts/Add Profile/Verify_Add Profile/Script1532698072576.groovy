import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('User Logins/User Login'), [('Emailaddress') : 'lagatywesleyk@gmail.com', ('password') : '@Wkk_5608'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Add Profile/Steps Add Profile'), [('profileDescription') : description, ('profileName') : profileName], 
    FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('Profile Management/Btn_Save'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.setText(findTestObject('Profile Management/Input_Search Profile'), profileName)

WebUiBuiltInKeywords.click(findTestObject('Profile Management/Btn_Search'))

searchedprofile = WebUiBuiltInKeywords.getText(findTestObject('Profile Management/Link_Profile Name'))

WebUiBuiltInKeywords.verifyEqual(profileName, searchedProfile)

WebUiBuiltInKeywords.closeBrowser()

