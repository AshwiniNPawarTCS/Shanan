package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://www.facebook.com/");
	Thread.sleep(4000);
	ref.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashwini");
	Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
	Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
	Thread.sleep(4000);
	ref.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Ashwini@123");
	Thread.sleep(4000);
	WebElement day = ref.findElement(By.xpath("//select[@id='day']"));
	//create object of select class
	Select a = new Select(day);
	//a.selectByValue("14");
	a.selectByVisibleText("14");
	Thread.sleep(4000);
	WebElement month = ref.findElement(By.xpath("//select[@id='month']"));
	Select a1 = new Select(month);
	a1.selectByValue("1");
	Thread.sleep(4000);
	WebElement year = ref.findElement(By.xpath("//select[@id='year']"));
	Select a2 = new Select(year);
	a2.selectByValue("1996");
	Thread.sleep(4000);
	 ref.findElement(By.xpath("//label[text()='Female']")).click();
	//Thread.sleep(4000);
	//Select a3=new Select(Gender);
	//Thread.sleep(4000);
	//a3.selectByVisibleText("Female");
	
	
	
	
	}

}
