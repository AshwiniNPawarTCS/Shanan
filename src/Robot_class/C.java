package Robot_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver ref =new ChromeDriver();
	    ref.get("https://www.hotstar.com/in");
	    Robot s =new Robot();
	    s.keyPress(KeyEvent.VK_KP_LEFT);
	    s.keyRelease(KeyEvent.VK_LEFT);
	    Thread.sleep(4000);
	    s.keyPress(KeyEvent.VK_PAGE_DOWN);
	    s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(4000);
	    s.keyPress(KeyEvent.VK_PAGE_UP);
	    s.keyRelease(KeyEvent.VK_PAGE_UP);
	    
	    
	
	
	}

}
