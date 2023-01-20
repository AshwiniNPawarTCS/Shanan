package popup;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver ref = new ChromeDriver();
	    ref.get("https://www.flipkart.com/");
	    ref.manage().window().maximize();
	    //click on cancel button
	    ref.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    //Search for mob
	    ref.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 12000", Keys.ENTER,Keys.ENTER);
	      Thread.sleep(4000);
	      //click on first phn
	      ref.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	
}}