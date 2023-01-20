package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver ref = new ChromeDriver();
	  ref.get("https://nxtgenaiacademy.com/alertandpopup/");
	  ref.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	      Alert c  =ref.switchTo().alert();
	      Thread.sleep(3000);
	       //c.accept();
	      //c.dismiss();
	 String  t=c.getText();
	 System.out.println(t);
	}

}
