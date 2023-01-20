package TestNG;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timesouts {
@Test

public void TC1() {
	
	
	
	
	Reporter.log("My first TestNg programme" ,true);
}
@Test(timeOut = 60000)
public void TC2() {

	Reporter.log("My second TestNg programme" ,true);
	Assert.fail();
}}
