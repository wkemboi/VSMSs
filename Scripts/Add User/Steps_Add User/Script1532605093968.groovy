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

WebUI.click(findTestObject('Dashboard/Link_Modules'))

WebUiBuiltInKeywords.click(findTestObject('Dashboard/Link_User management'))

WebUiBuiltInKeywords.click(findTestObject('User Management/Link_User'))

WebUiBuiltInKeywords.click(findTestObject('User Management/Btn_Add User'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.setText(findTestObject('User Management/Input_First Name'), firstName)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.setText(findTestObject('User Management/Input_Last Name'), lastName)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.setText(findTestObject('User Management/Input_Email Address'), email)

WebUI.delay(3)

WebUI.getAttribute(findTestObject('User Management/Input_Email Address'), email)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.setText(findTestObject('User Management/Input_Phone Number'), phone)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.setText(findTestObject('User Management/Input_Job Title'), title)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.click(findTestObject('User Management/Dropdown_Department'))

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.click(findTestObject('User Management/Option_Department', [('departments') : department]))

WebUiBuiltInKeywords.delay(5)

WebUiBuiltInKeywords.check(findTestObject('User Management/Checkbox_Job Function', [('job_function') : jobFunction]))

