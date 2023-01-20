package Robot_class;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref= new ChromeDriver();
	ref.get("https://www.lenskart.com/");
	//create object of robot class
	Robot r = new Robot();
	//key press
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//key release
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//key release
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//key release
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	
	
	
	
	}

}
