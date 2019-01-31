package newPKg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	
	public static WebDriver driver = null;
  @Test
  public void f() throws Throwable {
	  driver.findElement(By.id("txtUserID")).sendKeys("fip1111");
		driver.findElement(By.name("PIN")).sendKeys("adpadp09");
		driver.findElement(By.id("_ctl0_PageContent_Submit1")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("PlanNum"))));
		Thread.sleep(5000);
		driver.findElement(By.id("PlanNum")).sendKeys("325285");
		driver.findElement(By.id("_ctl0_PageContent_Submit1")).click();
  }
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() throws InterruptedException {
	  
	  
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\TelkarRa\\Desktop\\Eclipse\\gecko\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.get("http://cdldevretws01:99/SponsorSecure_Net/");
		Thread.sleep(5000);
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  
	  driver.quit();
  }

}
