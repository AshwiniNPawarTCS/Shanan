package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://www.google.com/");
	//choose the target element
	 WebElement target = ref.findElement(By.xpath("//a[text()='Gmail']"));
	//create object Action class
	Actions act = new Actions(ref);
	//use move to element method
	/*act.moveToElement(target).perform();
	//right click on target element
	act.contextClick(target).perform();
	// left click
	act.click(target).perform();
	// double click*/
	act.moveToElement(target).doubleClick().perform();
	
	
	}

}
