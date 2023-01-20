import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	//imlpicit wait(global wait)
	ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// maximize the browser
	ref.manage().window().maximize();
	// by default sel focus is on main webpage so need to switch it
	// switch to 1 st iframe
	ref.switchTo().frame("packageListFrame");
	//ref.findElement(null)
	String t1=ref.findElement(By.xpath("//h2[text()='Packages']")).getText();
	System.out.println(t1);
	ref.switchTo().defaultContent();
	//now jump from main web page to 2nd frame 
	 //ref.switchTo()frame()
	
	}

}
