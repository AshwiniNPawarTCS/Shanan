package Sceeenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class a {
 public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver ref = new ChromeDriver();
ref.get("https://www.google.co.in/");
// typecast takesscrrenshot interface
           TakesScreenshot    ts= (TakesScreenshot)ref;
       // takes the screenshot using getsscreenshot method
         File abc =ts.getScreenshotAs(OutputType.FILE);
         // create the object of file class
         File xyz=new File("C:\\Users\\Admin\\Desktop\\Sreenshot\\google.jpg");
         // we need to convert screenshot from src to destination
         Files.copy(abc, xyz);

 }
	

}
