package priya;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class Datalogin {
	WebDriver d = new FirefoxDriver();

	@DataProvider(name = "aarohi")
	public static Object[][] credentials() {

		return new Object[][] { { "admin", "admin123" }, { "admin", "" } };

	}

	@Test(dataProvider = "aarohi")
	public void f(String sUser, String sPassword) throws InterruptedException {
	
		 d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.id("txtUsername")).sendKeys(sUser);
		d.findElement(By.id("txtPassword")).sendKeys(sPassword);
		d.findElement(By.id("btnLogin")).click();
		waitForJStoLoad(d);

		d.findElement(By.xpath("//*[@id='welcome']")).click();
		waitForJStoLoad(d);

		d.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		d.close();
		

	}
	public boolean waitForJStoLoad(WebDriver driver) {

	    WebDriverWait wait = new WebDriverWait(driver, 30);

	    // wait for jQuery to load
	    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	        try {
	          return ((Long) ((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
	        }
	        catch (Exception e) {
	          return true;
	        }
	      }
	    };

	    // wait for Javascript to load
	    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	        return ((JavascriptExecutor)driver).executeScript("return document.readyState")
	            .toString().equals("complete");
	      }
	    };
	  return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

}
