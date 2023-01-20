package ashwini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.navigate().to("https://himalayawellness.in/");
	Thread.sleep(4000);
	ref.navigate().to("https://demo.actitime.com/login.do");
	// backword
	ref.navigate().back();
	//forword
	ref.navigate().forward();
	
	ref.navigate().refresh();
	}

}
