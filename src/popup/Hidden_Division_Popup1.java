package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.hotstar.com/in");
		Thread.sleep(3000);
	ref.findElement(By.xpath("//div[text()='LOGIN']")).click();
	ref.findElement(By.xpath("//div[@id='modal-close-icon']")).click();
	}

}
