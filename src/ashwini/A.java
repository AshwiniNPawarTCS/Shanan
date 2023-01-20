package ashwini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver ref = new ChromeDriver();
	ref.get("https://www.amazon.in/");
	
	}

}
