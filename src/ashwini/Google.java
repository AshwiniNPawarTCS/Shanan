package ashwini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref =new ChromeDriver();
	ref.get("https://demo.actitime.com/login.do");
	ref.findElement(By.id("username")).sendKeys("admin");
	ref.findElement(By.name("pwd")).sendKeys("manager");
	ref.findElement(By.xpath("//div[text()='Login ']")).click();
	ref.get("https://demo.actitime.com/user/submit_tt.do");
	String expT="actiTIME - Enter Time-Track";
	String actT= ref.getTitle();
	System.out.println(actT);
	if(expT.equals(actT)) {
		System.out.println("TC is pass");
		{
		System.out.println("TC is fail");
	}

	}
	}
}

