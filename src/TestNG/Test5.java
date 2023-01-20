package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ref.get("https://www.google.co.in/");
	Reporter.log("TC is fail", true);
	Assert.fail();
	}
	
	@Test
	public void Tc2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ref.get("https://www.foundit.in/");
		Reporter.log("job finding",true);
		Assert.fail();	
	}
	 @Test
	 public void Tc3() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver ref = new ChromeDriver();
			ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 ref.get("https://in.indeed.com/");
		 Reporter.log("indeed job",true);
		 Assert.fail();
	 }
	 
	 @Test
	 public void Tc4() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver ref = new ChromeDriver();
			ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ref.get("https://mamaearth.in/");
			Reporter.log("mamaearth",true);
			Assert.fail(); 
	 }
	 
	 @Test
	 public void TC5() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver ref = new ChromeDriver();
			ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ref.get("https://www.selenium.dev/");
			Reporter.log("selenium dev",true);
			Assert.fail();
		 
	 }

}
