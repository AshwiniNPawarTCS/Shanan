package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ref.get("https://www.amazon.in");
	Reporter.log("hii i am amazon", true);
	}
	@Test
	public void TC2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ref.get("https://www.mysql.com/");
	Reporter.log("hii i am SQL", true);
	Assert.fail();
}
	@Test
	public void TC3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ref.get("https://www.fssai.gov.in/");
	Reporter.log("hii i am Fssai", true);
	Assert.fail();
}}