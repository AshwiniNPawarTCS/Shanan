package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_Annotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open browser", true);
	}
@BeforeMethod
public void logintoapp() {
	Reporter.log("login to app",true);
}
@Test
public void verifyText() {
	Reporter.log("Running actual test case", true);
	
}
@AfterMethod
public void logoutApp() {
	Reporter.log("Logout from the App", true);
}
@AfterClass
public void CloseBrowser() {
	Reporter.log("close browser", true);
}
}
