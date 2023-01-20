package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_DDF {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();	
// implicitly wait();
	ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ref.get("https://demo.actitime.com/login.do");
	//enter un
	//ref.findElement(By.xpath(null))
	//enter un
		ref.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		String expT="actiTIME - Login";
		String actT=ref.getTitle();
		if(actT.equals(expT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
	}

	}
	


