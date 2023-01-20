package ashwini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.netflix.com/in/");
		Thread.sleep(4000);
		ref.manage().window().maximize();
		ref.close();
	}

}
