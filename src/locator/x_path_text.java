package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://demo.actitime.com/login.do");
	
	}

}
