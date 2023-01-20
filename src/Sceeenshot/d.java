package Sceeenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class d {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref =  new ChromeDriver();
	ref.get("https://www.hotstar.com/in");
	TakesScreenshot ts = (TakesScreenshot)ref;
	     // take the screenshot using getscreenshot method
	     File re =  ts.getScreenshotAs(OutputType.FILE);
	     // create object of file class
	     File t = new File("C:\\\\Users\\\\Admin\\\\Desktop\\\\Sreenshot\\\\hotstar.png");
	     Files.copy(re, t);
	           
	
	
	}

}
