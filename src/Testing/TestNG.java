package Testing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class TestNG {
	WebDriver driver = new FirefoxDriver();
  @Test
  public void f() {
	  driver.get("https://www.gmail.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
  }

}
