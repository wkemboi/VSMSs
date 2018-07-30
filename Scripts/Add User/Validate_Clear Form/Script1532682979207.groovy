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

WebUI.callTestCase(findTestCase('Add User/Steps_Add User'), [('firstName') : 'wesklm', ('lastName') : 'kips', ('email') : 'markwesoo@yahoo.com'
        , ('title') : 'Sales Man', ('phone') : '0723456789', ('department') : 'marketing', ('jobFunction') : 'is_staff', ('useStatus') : 'inactive'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUiBuiltInKeywords.click(findTestObject('User Management/Btn_Clear'))

not_run: clearedfirstname = WebUiBuiltInKeywords.getText(findTestObject('User Management/Input_First Name', [('clearedFirstname') : clearedFirstname]))

not_run: WebUI.verifyNotEqual(clearedFirstname, firstName)

not_run: WebUiBuiltInKeywords.closeBrowser()

