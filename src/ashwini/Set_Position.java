package ashwini;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Position {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://www.facebook.com/");
	// create object of point class
	Point p = new Point(300, 400);
	//use set position method
	ref.manage().window().setPosition(p);
	}
      
}
