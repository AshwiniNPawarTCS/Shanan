package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref =  new ChromeDriver();
		ref.get("https://www.youtube.com/");
		Thread.sleep(3000);
		JavascriptExecutor dap = (JavascriptExecutor)ref;
		dap.executeScript("window.scrollBy(0,5000);");
		Thread.sleep(3000);
		dap.executeScript("window.scrollBy(0,-2000);");
		
		
		
		
	}

}
