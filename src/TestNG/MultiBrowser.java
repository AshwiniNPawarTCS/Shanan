 package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
     @Parameters("browsername") // annotation
	@Test
	public void TC(String browsername) {// parameterized method
	// declare the global Variable
	 WebDriver ref= null; // runtime polymorphism
	 //apply condition
	 if(browsername.equals("Chrome")) {
		 // for chrome Browser;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	 
	  ref = new ChromeDriver();
	 
	 }
	 else if (browsername.equals("Firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	 }
	 
	 ref.get("https://www.amazon.in/");
}
}  
