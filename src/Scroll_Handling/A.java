package Scroll_Handling;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	     WebDriver ref =new ChromeDriver();
	     ref.get("https://www.amazon.in/");
	     // use java script executor interface
	     Thread.sleep(4000);
	     JavascriptExecutor abc =(JavascriptExecutor)ref;
	     abc.executeScript("window.scrollBy(0,2000)");
	     Thread.sleep(4000);
	     abc.executeScript("window.scrollBy(0,-2000)");
	     
	    
	     
	
	
	
	}

}
