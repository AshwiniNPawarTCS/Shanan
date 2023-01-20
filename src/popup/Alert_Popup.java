package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://demo.guru99.com/test/delete_customer.php");
	// enter user id 
	ref.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123345");
	ref.findElement(By.xpath("//input[@name='submit']")).click();
	// first we need to switch the control of selenium from webpage to popup
            Alert alt= ref.switchTo().alert();
            //alt.accept();
           // alt.dismiss();
            String text= alt.getText();
            System.out.println(text);
	
	
	}

}
