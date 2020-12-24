import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class NewSalesSteps {

	/*2.1.1*/

	@Given("User on homepage with validID")
	def User_on_homepage_with_validID()
	{
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://sandbox.jurnal.id/')

		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Sales Invoice/Enter_Email'), 'dikabrenda@outlook.com')

		WebUI.setEncryptedText(findTestObject('Sales Invoice/Enter_Password'), '8SQVv/p9jVScEs4/2CZsLw==')

		WebUI.click(findTestObject('Sales Invoice/Sign_In'))

		WebUI.verifyElementVisible(findTestObject('Sales Invoice/Verify Element Dashboard Jurnal'))
	}

	@And("User click sales")
	def User_click_sales() 
	{
		WebUI.click(findTestObject('Sales Invoice/Sales'))
	}

	@And("User click create new sale button")
	def User_click_create_new_sale_button()
	{
		WebUI.click(findTestObject('Sales Invoice/Create New Sale'))
	}

	@And("User select Sales Invoice button")
	def User_select_Sales_Invoice_button()
	{
		WebUI.click(findTestObject('Sales Invoice/Sales Invoice'))
	}

	@When("User Select dropdown existing customer on the list")
	def User_select_dropdown_existing_customer_on_the_list()
	{
		WebUI.click(findTestObject('Sales Invoice/Dropdown'))
	}

	@Then("User should be able to see existing customer on the list Successfully")
	def User_should_be_able_to_see_existing_customer_on_the_list_successfully()
	{
		WebUI.verifyElementPresent(findTestObject('Sales Invoice/dropdownBox'), 5)
	}


	/*2.1.2*/


	@Given("User on Create Sales Invoice Page with validID")
	def User_on_the_create_Sales_Invoice_Page_with_validId()
	{
		WebUI.verifyElementPresent(findTestObject('Add new customer/span_Create Sales Invoice'), 2)
	}

	@Then("User Select dropdown customer and added new customer")
	def User_select_dropdown_customer_and_added_new_customer()
	{
		WebUI.click(findTestObject('Add new customer/div_ Type to Add'))
	}

	@And("User Enter Name (.*)")
	def User_Enter_Name(String name)
	{
		WebUI.setText(findTestObject('Add new customer/Display_Name'), name)
	}

	@And("User Enter Email (.*)")
	def User_Enter_Email(String email)
	{
		WebUI.setText(findTestObject('Add new customer/Email'), email)
	}

	@And("User Enter Address (.*)")
	def User_Enter_Address(String address)
	{
		WebUI.setText(findTestObject('Add new customer/Billing Address'), address)
	}

	@And("User Enter Phone Number (.*)")
	def User_Enter_Phone_Number(String phone)
	{
		WebUI.setText(findTestObject('Add new customer/Phone'), phone)
	}

	@When("User click save button")
	def User_click_save_button()
	{
		WebUI.click(findTestObject('Add new customer/Save_Button'))
	}

	@Then("User should be able added new customer Successfully")
	def User_should_be_able_added_new_customer_Successfully(){
	}


	/*2.2.1*/


	@And("User click calendar on transaction date")
	def User_click_calendar_on_transaction_date(){

		WebUI.click(findTestObject('Transaction Date/Transaction Date Calendar'))
	}

	@When("User click date")
	def User_click_date(){

		WebUI.click(findTestObject('Transaction Date/Tanggal_14'))
	}

	@Then("User should be able entered date successfully")
	def User_should_be_able_entered_date_successfully(){

		WebUI.verifyElementPresent(findTestObject('Transaction Date/Verify Transaction date'), 2)
	}


	/*2.2.2*/


	@And("User click Term")
	def User_click_term(){
		WebUI.click(findTestObject('Transaction Date/span_Net 30'))
		WebUI.verifyElementPresent(findTestObject('Transaction Date/verify term box'), 2)
	}

	@When("User select date modal")
	def User_select_date_modal(){
		WebUI.click(findTestObject('Transaction Date/div_Net 60'))
	}

	@Then("User should be able entered by date modal successfully")
	def User_should_be_able_entered_by_date_modal_successfully(){
		WebUI.verifyElementPresent(findTestObject('Transaction Date/Verify Due Date'), 2)
	}


	/*2.3.1*/


	@When("User click product")
	def User_click_product(){
		WebUI.verifyTextPresent('Product', true)

		WebUI.click(findTestObject('Product/Select product'))
	}

	@Then("User should be able to see existing product on the list")
	def User_should_be_able_to_see_existing_product_on_the_list(){
		WebUI.verifyElementPresent(findTestObject('Product/Dropdown Product01'), 5)
	}


	/*2.3.2*/


	@And("User click type to add button in select product")
	def User_click_type_to_add_button_in_select_product(){
		WebUI.click(findTestObject('Product/div_Type to Add'))
	}

	@And("User enter name (.*) and Product code (.*)")
	def User_enter_name_and_product_code(String name, String code){
		WebUI.setText(findTestObject('Product/productname'), name)
		WebUI.setText(findTestObject('Product/productproduct_code'), code)
	}

	@When("User click save")
	def User_click_save(){
		WebUI.click(findTestObject('Product/button_Save'))
	}

	@Then("User should be able to added new product")
	def User_should_be_able_to_added_new_product(){
		WebUI.verifyElementPresent(findTestObject('Product/Select product'), 2)
	}


	/*2.3.3*/


	@When("User click add more data button")
	def User_click_add_more_data_button(){
		WebUI.click(findTestObject('Product/a_ Add More Data'))
	}

	@Then("User should be able to added another product")
	def User_should_be_able_to_added_another_product(){
		WebUI.verifyElementPresent(findTestObject('Product/Verify Data added'), 2)
	}


	/*2.4.1*/


	@When("User enter unit price")
	def User_Enter_unit_price(){
		WebUI.setText(findTestObject('Product/Unit_Price01'), '400000')
	}

	@Then("User should be able to enter price successful")
	def User_should_be_able_to_enter_price_successful(){
		WebUI.verifyElementPresent(findTestObject('Product/Verify div_Rp. 400000,00'), 2)
	}


	/*2.5.1*/


	@When("User click browse in attachment and upload picture")
	def User_click_browse_in_attachment_and_upload_picture()
	{
		WebUI.scrollToElement(findTestObject('Upload Picture/label_Attachments'), 2)
		WebUI.uploadFile(findTestObject('Upload Picture/div_Drop file to attach, or browsemax size 10 MBfile'), 'C:/Users/BMT/Pictures/Mekari.jpg')
	}

	@Then("User uploaded picture successfully")
	def User_uploaded_picture_successfully()
	{
		WebUI.verifyElementPresent(findTestObject('Upload Picture/div_UploadingMekari.jpg0.2 MB'), 2)
	}


	/*2.6.1*/


	@When("User click create button")
	def User_click_create_button()
	{
		WebUI.click(findTestObject('Created Invoice/input_Cancel_create'))
	}

	@Then("User created sales invoice successfully")
	def User_created_sales_invoice_successfully()
	{
		WebUI.verifyElementPresent(findTestObject('Created Invoice/div_Successfully processed'), 2)
		WebUI.verifyElementPresent(findTestObject('Created Invoice/h2_TransactionsSales Invoice 10001'), 2)
		WebUI.closeBrowser()
	}
}