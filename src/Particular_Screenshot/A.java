package Particular_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.google.co.in/");
		WebElement abc= ref.findElement(By.xpath("//img[@class='lnXdpd']"));
	 File y 	= abc.getScreenshotAs(OutputType.FILE);
		File tr = new File("C:\\Users\\Admin\\Desktop\\ss\\google.png");
		Files.copy(y, tr);
		
	}

}
