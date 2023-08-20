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

Mobile.startApplication('C:\\Work\\Learning\\Eduwork\\mobile-test-katalon\\Eduapp\\Androidapp\\Calculator-V8.apk', true)

println('SUM Number')

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - plus'), 0)

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 9'), 0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - equal to'), 0)

print('Reduction Number')

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 6'), 0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - minus'), 0)

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - equal to'), 0)

println('Multiplication Number')

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 7'), 0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - x'), 0)

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 5'),0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - equal to'), 0)

println('Mid Number')

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 5'),0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - mid'), 0)

Mobile.tap(findTestObject('Object Repository/Calculator-number/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/math-symbols/android.widget.Button - equal to'), 0)