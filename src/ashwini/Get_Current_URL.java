package ashwini;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_URL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver ref =new ChromeDriver();
	  ref.get("https://mamaearth.in/");
	//get currenturl method
	 String b = ref.getCurrentUrl();// syntax= string ref  = ref v. method
	System.out.println(b);
	}

}
