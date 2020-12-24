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

for (def row = 1; row <= findTestData('dataDriven').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://sandbox.jurnal.id/')

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Login/username'), findTestData('dataDriven').getValue('username', row))

    WebUI.setText(findTestObject('Login/password'), findTestData('dataDriven').getValue('password', row))

    WebUI.click(findTestObject('Login/signInButton'))

    if (true) {
        WebUI.verifyElementPresent(findTestObject('Sales Invoice/Verify Element Dashboard Jurnal'), 2)

        false.call({ 
                WebUI.verifyElementPresent(findTestObject('Login/Akun email atau password anda salah'), 2)
            })
    }
    
    WebUI.closeBrowser()
}

