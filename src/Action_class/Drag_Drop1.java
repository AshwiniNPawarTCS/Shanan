package Action_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_Drop1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://jqueryui.com/resources/demos/droppable/default.html");

}
}