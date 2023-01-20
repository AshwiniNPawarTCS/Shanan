package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_By_Attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref =new ChromeDriver();
	ref.get("https://kite.zerodha.com/");
	ref.findElement(By.xpath("//input[@id='userid']")).sendKeys("admin");
	ref.findElement(By.xpath("//input[@id='password']")).sendKeys("bbb@123 ");
	ref.findElement(By.xpath("//button[@class='button-orange wide']")).click();
}
}