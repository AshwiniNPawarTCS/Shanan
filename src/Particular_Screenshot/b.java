package Particular_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class b {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver,chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref= new ChromeDriver();
	ref.get("https://www.selenium.dev/");
	WebElement abc= ref.findElement(By.xpath("//p[@class='display-1 font-weight-normal mb-0']"));
	File r= abc.getScreenshotAs(OutputType.FILE);
	File y= new File("C:\\Users\\Admin\\Desktop\\ss\\Selenium.png");
	Files.copy(r, y);
	
	
	}

}
