package pageFactory_TestNG;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest {
	Sheet sh;
	 WebDriver ref;
	 LoginPage l;
	 HomePage h;
	
@BeforeClass
public void openBrowser() throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\Book1.xlsx");
 sh = WorkbookFactory.create(fis).getSheet("sheet1");
System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
     ref = new ChromeDriver();
    ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
ref.get("https://demo.actitime.com/login.do");

// all objects we need to create
  l=new LoginPage(ref);
 h= new HomePage(ref);
}
	@BeforeMethod
	public void openApp() {
	String	username=sh.getRow(0).getCell(0).getStringCellValue();
	     l.enterUN(username);
	 String password= sh.getRow(0).getCell(1).getStringCellValue();
	l.enterPWD(password);
	l.clickLoginBTN();
	}
	@Test
	public void verifyTest() {
		Reporter.log("Running VerifyText",true);
		String  expText = sh.getRow(0).getCell(2).getStringCellValue();
	             String actText= h.verifyText();
	Assert.assertEquals(expText, actText);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from app", true);
	}
	 @AfterClass  
	 public void closeBrowser() {
		 Reporter.log("close the browser",true);
		 
	 }

	
	
}

