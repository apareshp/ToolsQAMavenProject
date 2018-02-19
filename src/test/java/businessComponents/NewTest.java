package businessComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDriversEXE/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://toolsqa.com/");
	  driver.manage().window().maximize();
	  System.out.println("Hello");
  }
}
