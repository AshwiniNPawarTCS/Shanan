package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multisuite {
	@Parameters("Browsername")
@Test
public void TC(String Browsername) {
		WebDriver ref= null;
		if(Browsername.equals("Chrome")) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
ref = new ChromeDriver();
		}
		else if(Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		ref=new FirefoxDriver();
		
		}
 ref.get("https://www.amazon.in/");
}}