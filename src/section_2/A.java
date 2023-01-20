package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://www.sugarcrm.com/au/request-demo/");
	Thread.sleep(4000);
	//handling list box
	ref.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
     Thread.sleep(4000);
	  ref.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwineepawae1410@gmail.com");
	  Thread.sleep(4000);
	//incomplete
	ref.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashwini");
	 Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
	 Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@name='phone_work']")).sendKeys("1234567890");
	 Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@name='title']")).sendKeys("Testing");
	 Thread.sleep(4000);
      WebElement	h=ref.findElement(By.xpath(("//Select[@id='how-select']")));
      Thread.sleep(4000);
      Select s = new Select(h);
          Thread.sleep(4000);
            s.deselectByVisibleText("Event");
	}

}
