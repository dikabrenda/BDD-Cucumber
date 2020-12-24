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

WebUI.navigateToUrl('https://sandbox.jurnal.id/')

WebUI.comment('Login')

WebUI.setText(findTestObject('Sales Invoice/Enter_Email'), 'dikabrenda@outlook.com')

WebUI.setEncryptedText(findTestObject('Sales Invoice/Enter_Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Sales Invoice/Sign_In'))

WebUI.verifyElementVisible(findTestObject('Sales Invoice/Verify Element Dashboard Jurnal'))

WebUI.takeScreenshot('C://Users//BMT//git//mekari-qa-test//Screenshots')

WebUI.comment('Home Page')

WebUI.click(findTestObject('Sales Invoice/Sales'))

WebUI.click(findTestObject('Sales Invoice/Create New Sale'))

WebUI.click(findTestObject('Sales Invoice/Sales Invoice'))

WebUI.takeScreenshot('C:/Users/BMT/git/mekari-qa-test/Screenshots')

WebUI.comment('Add customer')

WebUI.click(findTestObject('Sales Invoice/Dropdown'))

WebUI.verifyElementPresent(findTestObject('Sales Invoice/dropdownBox'), 2)

WebUI.verifyElementPresent(findTestObject('Add new customer/span_Create Sales Invoice'), 2)

WebUI.click(findTestObject('Add new customer/div_ Type to Add'))

WebUI.setText(findTestObject('Add new customer/Display_Name'), 'test005')

WebUI.setText(findTestObject('Add new customer/Email'), 'test005@gmail.com')

WebUI.setText(findTestObject('Add new customer/Billing Address'), 'test005 address')

WebUI.setText(findTestObject('Add new customer/Phone'), '12345670015')

WebUI.click(findTestObject('Add new customer/Save_Button'))

WebUI.takeScreenshot('C:/Users/BMT/git/mekari-qa-test/Screenshots')

WebUI.comment('Transaction Date')

WebUI.click(findTestObject('Transaction Date/Transaction Date Calendar'))

WebUI.click(findTestObject('Transaction Date/Tanggal_14'))

WebUI.verifyElementPresent(findTestObject('Transaction Date/Verify Transaction date'), 2)

WebUI.click(findTestObject('Transaction Date/span_Net 30'))

WebUI.verifyElementPresent(findTestObject('Transaction Date/verify term box'), 2)

WebUI.click(findTestObject('Transaction Date/div_Net 60'))

WebUI.verifyElementPresent(findTestObject('Transaction Date/Verify Due Date'), 5)

WebUI.takeScreenshot('C:/Users/BMT/git/mekari-qa-test/Screenshots')

WebUI.comment('Product')

WebUI.click(findTestObject('Product/Select product'))

WebUI.verifyElementPresent(findTestObject('Product/Dropdown Product01'), 5)

WebUI.click(findTestObject('Product/div_Type to Add'))

WebUI.setText(findTestObject('Product/productname'), 'Kopi 0004')

WebUI.click(findTestObject('Product/button_Save'))

WebUI.setText(findTestObject('Product/Unit_Price01'), '400000')

WebUI.verifyElementPresent(findTestObject('Product/Verify div_Rp. 400000,00'), 2)

WebUI.click(findTestObject('Product/a_ Add More Data'))

WebUI.verifyElementPresent(findTestObject('Product/Verify Data added'), 2)

WebUI.takeScreenshot('C:/Users/BMT/git/mekari-qa-test/Screenshots')

WebUI.comment('Upload Picture')

WebUI.scrollToElement(findTestObject('Upload Picture/label_Attachments'), 2)

WebUI.uploadFile(findTestObject('Upload Picture/div_Drop file to attach, or browsemax size 10 MBfile'), 'C:/Users/BMT/Pictures/Mekari.jpg')

WebUI.verifyElementPresent(findTestObject('Upload Picture/div_UploadingMekari.jpg0.2 MB'), 2)

WebUI.takeScreenshot('C:/Users/BMT/git/mekari-qa-test/Screenshots')

WebUI.comment('Create Invoice')

WebUI.click(findTestObject('Created Invoice/input_Cancel_create'))

WebUI.verifyElementPresent(findTestObject('Created Invoice/div_Successfully processed'), 2)

WebUI.verifyElementPresent(findTestObject('Created Invoice/h2_TransactionsSales Invoice 10001'), 2)

WebUI.takeScreenshot('C:/Users/BMT/git/mekari-qa-test/Screenshots')

WebUI.closeBrowser()

