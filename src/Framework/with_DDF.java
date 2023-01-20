package Framework;

import java.io.FileInputStream;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_DDF {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Admin\\\\Downloads\\\\Book1.xlsx");
	Sheet sh = WorkbookFactory. create(fis).getSheet("sheet1");
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	WebDriver ref= new ChromeDriver();
	ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ref.get("https://demo.actitime.com/login.do");
	// enter un
	String un= sh.getRow(0).getCell(0).getStringCellValue();
	ref.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	//enter pwd
	String pwd= sh.getRow(0).getCell(1).getStringCellValue();
	ref.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	//enter loging
	ref.findElement(By.xpath("//div[text()='Login ']")).click();
	
	
	}

}
