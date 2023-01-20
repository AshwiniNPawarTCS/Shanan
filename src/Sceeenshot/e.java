package Sceeenshot;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class e {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver ref = new ChromeDriver();
	     ref.get("https://www.milton.in/");
	     TakesScreenshot t = (TakesScreenshot)ref;
	             File g  =t.getScreenshotAs(OutputType.FILE);
	             File y = new File("C:\\Users\\Admin\\Desktop\\Sreenshot\\milton.jpg");
	             Files.copy(g, y);
	     
	     
}
}