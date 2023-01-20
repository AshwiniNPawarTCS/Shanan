package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ref.get("https://demo.actitime.com/login.do");
	Reporter.log("hii i am actitime", true);
	}
 @Test
 public void TC2() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ref.get("https://www.google.com/");
	Reporter.log("hii i am google", true);
	}
     
}
