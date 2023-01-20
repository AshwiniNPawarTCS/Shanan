package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_popup {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://www.flipkart.com/");
	//click on popup
	ref.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}

}
