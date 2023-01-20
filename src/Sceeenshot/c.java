package Sceeenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class c {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         WebDriver ref = new ChromeDriver();
	         ref.get("https://www.samsung.com/");
	         TakesScreenshot ts =  (TakesScreenshot)ref;
	       File io = ts.getScreenshotAs(OutputType.FILE);
	       File xy= new File("C:\\Users\\Admin\\Desktop\\Sreenshot\\samsung.png");
	       Files.copy(io, xy);
	
	}

}
