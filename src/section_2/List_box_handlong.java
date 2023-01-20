package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_handlong {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver ref = new ChromeDriver();
		ref.get("https://www.facebook.com/");
		//click on create new account btn 
		
		ref.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		//select any listbox
		WebElement day = ref.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(4000);
		// create object of select class
		Select s = new Select(day);
		s.selectByValue("15");
		Thread.sleep(1000);
		WebElement month=ref.findElement(By.xpath("//select[@id='month']"));
		Select s1 =new Select(month);
		s1.selectByValue("10");
	   Thread.sleep(1500);
		WebElement year= ref.findElement(By.xpath("//select[@id='year']"));
		Select s2= new Select(year);
		s2.selectByValue("1996");

		
		
		
		
}
}