package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.google.com/");
		// Choose the target element 
		 WebElement target=ref.findElement(By.xpath("//a[@ class='gb_j']"));
		// create object of Actions class
		Actions s = new Actions(ref);
		// all method in single step using build method and perform method
		s.moveToElement(target).contextClick().doubleClick().perform();
	}

}
