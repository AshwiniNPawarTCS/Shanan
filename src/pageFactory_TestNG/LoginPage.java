package pageFactory_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath ="//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement LoginBTN; 

// initialization
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void enterUN (String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLoginBTN() {
		LoginBTN.click();
	}
	
	
	
	
	
	
	
}
