package ashwini;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver ref =new ChromeDriver();
	    ref.get("https://www.lenskart.com/");
	// Create object of dimension class 
	    Dimension d = new Dimension(200, 100);
	    // used the set size method
	    ref.manage().window().setSize(d);
	}

}
