package ashwini;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref= new ChromeDriver();
	ref.get("https://demo.actitime.com/login.do");
	//enter
	ref.findElement(By.id("username")).sendKeys("admin");
	ref.findElement(By.name("pwd")).sendKeys("manager");
	ref.findElement(By.xpath("//div[text()='Login ']")).click();

	

}
}
