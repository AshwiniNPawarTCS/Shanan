package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
	@Test
	public void TC1() {
		
		
		
		
		Reporter.log("My first TestNg programme" ,true);
	}
	@Test(enabled = false)
	public void TC2() {
		
		
		
		
		Reporter.log("My second TestNg programme" ,true);
		
}}
