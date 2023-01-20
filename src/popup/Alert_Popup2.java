package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	   WebDriver ref = new ChromeDriver();
	   ref.get("https://nxtgenaiacademy.com/alertandpopup/");
	    ref.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	     Alert    alt  = ref.switchTo().alert();
	    // alt.accept();
	    // alt.dismiss();
	 String   b =alt.getText();
	 System.out.println(b);
	
	}

}
