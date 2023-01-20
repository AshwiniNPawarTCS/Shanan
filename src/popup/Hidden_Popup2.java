package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Popup2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver ref = new ChromeDriver();
	    ref.get("https://www.irctc.co.in/nget/train-search");
	    ref.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
	
	
	}

}
