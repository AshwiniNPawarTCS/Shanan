package ashwini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	  WebDriver ref = new ChromeDriver();
	  ref.get("https://www.youtube.com/premium");
	   ref.manage().window().maximize();
	   Thread.sleep(4000);
	// minimize
	   ref.manage().window().minimize();
	 
	}

}
