package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver ref = new ChromeDriver();
		  ref.get("https://nxtgenaiacademy.com/alertandpopup/");
	       ref.findElement(By.xpath("//button[@name='alertbox']")).click();
	      Alert t =ref.switchTo().alert();
	      //t.accept();
	      t.dismiss();
	  //String  v = t.getText();
	  //System.out.println(v);
	
	}

}
