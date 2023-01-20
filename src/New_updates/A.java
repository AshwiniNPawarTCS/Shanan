package New_updates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("K", "v");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
	//WebDriverManager.Chromedriver().setup();
	}

}
