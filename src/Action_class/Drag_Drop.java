package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
	ref.get("https://jqueryui.com/resources/demos/droppable/default.html");
            WebElement ele1 = ref.findElement(By.xpath("//div[@id='draggable']"));
          WebElement ele2 = ref.findElement(By.xpath("//div[@id='droppable']"));
          // Create object of Actions Class
          Actions s = new Actions(ref);
          s.dragAndDrop(ele1, ele2).perform();
}
}