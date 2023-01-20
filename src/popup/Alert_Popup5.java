package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_Popup5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     WebDriver ref = new ChromeDriver();
	     ref.get("https://demo.automationtesting.in/Alerts.html");
	     ref.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert  b  =  ref.switchTo().alert();
	//b.accept();
	//b.dismiss() ; 
	         String a = b.getText();
	         System.out.println(a);
	     
	
	}

	

}
