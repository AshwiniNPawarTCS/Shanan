package ashwini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.phonepe.com/");
	// test data 
	String ref= driver.getTitle();
	System.out.println(ref);
	
	String expT="PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & More";
	String actT= driver.getTitle();
	if (expT.equals(actT)){
		System.out.println("TC is pass");
	
	}
	else {
		System.out.println("TC is fail");
	}
	String exp="PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & 2 More";
	if (exp.equals(actT)) {
		System.out.println("TC is pass"); 
		
	}
	else {
		System.out.println("TC is fail");
	}
	
	
	driver.close();
}
	
	}