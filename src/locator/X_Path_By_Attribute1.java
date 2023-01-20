package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_By_Attribute1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref =new ChromeDriver();
		ref.get("https://demo.actitime.com/login.do");
		ref.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		ref.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		ref.findElement(By.xpath("//div[text()='Login ']")).click();
		String exptT="actiTIME - Login";
		String actT=ref.getTitle();
		System.out.println(actT);
		if(exptT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
