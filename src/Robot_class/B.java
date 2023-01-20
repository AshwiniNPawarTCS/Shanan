package Robot_class;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver ref =new ChromeDriver();
		ref.get("https://www.amazon.in/");
		// create object robot method 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_END);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
		
		
		
		
	
}}