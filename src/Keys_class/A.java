package Keys_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://demo.applitools.com/");
	ref.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,("manager"),Keys.TAB,Keys.ENTER);
	}

}
