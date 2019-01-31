package newPKg;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public static WebDriver driver = null;
	static ExtentReports report;
	static ExtentTest test;
  @Test
  public void f() throws Throwable {
	  
	  

	  
	  driver.findElement(By.id("txtUserID")).sendKeys("fip1111");
	  test.log(LogStatus.PASS, "User Id filled");
		driver.findElement(By.name("PIN")).sendKeys("adpadp09");
		test.log(LogStatus.PASS, "Password filled");
		
		driver.findElement(By.id("_ctl0_PageContent_Submit1")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("PlanNum"))));
		Thread.sleep(5000);
		driver.findElement(By.id("PlanNum")).sendKeys("325285");
		driver.findElement(By.id("_ctl0_PageContent_Submit1")).click();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	  test = report.startTest("ExtentDemo");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\TelkarRa\\Desktop\\Eclipse\\gecko\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    test.log(LogStatus.PASS, "Browser Invoked");
	    driver.get("http://cdldevretws01:99/SponsorSecure_Net/");
	    test.log(LogStatus.PASS, "Navigated to the specified URL");
		Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  test.log(LogStatus.PASS, "Browser Closed");
  }

}
