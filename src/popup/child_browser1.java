package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref= new ChromeDriver();
	ref.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	ref.manage().window().maximize();
	ref.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 12000",Keys.ENTER);
	Thread.sleep(4000);
	ref.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).sendKeys(Keys.ENTER);
	}

}
