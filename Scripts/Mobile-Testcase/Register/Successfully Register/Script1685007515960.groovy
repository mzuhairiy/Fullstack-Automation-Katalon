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

Mobile.tap(findTestObject('Mobile Objects/Register/android.widget.TextView - Link Daftar'), 0)

Mobile.verifyElementVisible(findTestObject('Mobile Objects/Register/android.widget.TextView - Selamat Datang Daftar'), 0)

Mobile.setText(findTestObject('Mobile Objects/Register/android.widget.EditText - Nama Toko'), 'zuzu3', 0)

Mobile.setText(findTestObject('Mobile Objects/Register/android.widget.EditText - Email'), 'zuhair@zu.com', 0)

Mobile.setText(findTestObject('Mobile Objects/Register/android.widget.EditText - Password'), 'zuzu123', 0)

Mobile.tap(findTestObject('Mobile Objects/Register/android.widget.TextView - Btn Daftar'), 0)

Mobile.verifyElementVisible(findTestObject('Mobile Objects/Register/android.widget.TextView - Pendaftaran Berhasil'), 0)

Mobile.tap(findTestObject('Mobile Objects/Register/android.widget.TextView - LOGIN'), 0)

Mobile.verifyElementVisible(findTestObject('Mobile Objects/Register/android.widget.TextView - Selamat Datang Masuk'), 0)

