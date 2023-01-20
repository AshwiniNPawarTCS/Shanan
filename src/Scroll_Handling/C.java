package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver ref = new ChromeDriver();
	   ref.get("https://mamaearth.in/");
	   Thread.sleep(3000);
	   JavascriptExecutor ty = (JavascriptExecutor)ref;
	   //scroll down
	   ty.executeScript("window.scrollBy(0,2000);");
	   //scroll up
	  Thread.sleep(4000);
	   ty.executeScript("window.scrollBy(0,-500);");
	   
	
	}

}
