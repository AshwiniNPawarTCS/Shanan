package Sceeenshot;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class b {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.amazon.in/");
		//typecast takess.creenshot interface
		TakesScreenshot ts= (TakesScreenshot)ref;
		//Take the screenshot using getScrrenshot method
		File gef= ts.getScreenshotAs(OutputType.FILE);
		//create object of the file class
		File ty = new File("C:\\Users\\Admin\\Desktop\\Sreenshot\\amazon.jpg");
		Files.copy(gef, ty);
	}

}
