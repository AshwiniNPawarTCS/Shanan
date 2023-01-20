package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver abc = new ChromeDriver();
		abc.get("https://www.samsung.com/");
		Thread.sleep(4000);
		JavascriptExecutor th =(JavascriptExecutor)abc;
		//scroll down
		th.executeScript("window.scrollBy(0,7000);");
		//scrollup
		Thread.sleep(4000);
		th.executeScript("window.scrollBy(0,-4000);");
	}

}
