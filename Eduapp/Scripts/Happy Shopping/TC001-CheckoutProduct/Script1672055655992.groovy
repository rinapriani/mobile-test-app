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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('Androidapp/Happy Day Shopping_1.2_Apkpure.apk', true)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/Happy-Shopping/android.widget.ImageView-01 FlashSaleNew'), 0)

Mobile.tap(findTestObject('Object Repository/Happy-Shopping/android.widget.ImageView-02 ProductNew'), 0)

Mobile.tap(findTestObject('Object Repository/Happy-Shopping/android.widget.EditText - 03 EditQty'), 0)

Mobile.setText(findTestObject('Happy-Shopping/android.widget.EditText - 03 EditQty'), '5', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Happy-Shopping/android.widget.TextView - .13.20'),0)

Mobile.tap(findTestObject('Object Repository/Happy-Shopping/android.widget.TextView - Add to Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Happy-Shopping/android.widget.ImageView-YourBagNew'), 0)

Mobile.tap(findTestObject('Object Repository/Happy-Shopping/android.widget.TextView - CheckoutNew'), 0)

Mobile.delay(10)

Mobile.verifyMatch('Shopping Cart', 'Shopping Cart', false)

//CurrentUrL= WebUI.getUrl()

//Mobile.verifyMatch(CurrentUrL, 'https://www.happydayshopping.com/products/cart', false)

Mobile.closeApplication()
