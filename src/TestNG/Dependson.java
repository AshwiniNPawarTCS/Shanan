package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson {
  @Test
  public void login() {
	  Reporter.log("running login");
  }
  @Test (dependsOnMethods = ("login"))
  public void logout() {
	  Reporter.log("running logout");
  }
}
