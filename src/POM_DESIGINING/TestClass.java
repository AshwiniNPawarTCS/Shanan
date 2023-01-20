package POM_DESIGINING;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ref.get("https://demo.actitime.com/login.do");
	//call 1st pom class
	
	LoginPage o = new LoginPage(ref);
	o.enterUn();
	o.enterPWD();
	o.clickLoginBtn();
	//call 2nd POM class
	HomePage j= new HomePage(ref);
	j.verifytext();
	
	}

}
