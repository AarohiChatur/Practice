package com;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnSelenium {

	public static void main(String[] args) {
		testEmptyUserName();
		testEmptyPassword();
		invaliduser();
		invalidpassword();
     	loginPage();
		searchemploye();
		
	}
	
	private static void testEmptyUserName() {
		FirefoxDriver driver = openPage();
				
		 driver.findElement(By.id("txtUsername")).clear();

		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		 driver.findElement(By.id("btnLogin")).click();

		String error = driver.findElement(By.id("spanMessage")).getText();
		
		Assert.assertEquals("Username cannot be empty", error);
		driver.close();
	}

	private static void testEmptyPassword() {
		FirefoxDriver driver = openPage();
		
		WebElement userNameElement = driver.findElement(By.id("txtUsername"));
		
		userNameElement.sendKeys("admin");
		
		driver.findElement(By.id("txtPassword")).clear();

		driver.findElement(By.id("btnLogin")).click();

		String error = driver.findElement(By.id("spanMessage")).getText();
		
		Assert.assertEquals("Password cannot be empty", error);
		driver.close();
	}
	private static void invaliduser()
	{
		 FirefoxDriver driver = openPage();
		 driver.findElement(By.id("txtUsername")).sendKeys("tins");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 String error = driver.findElement(By.id("spanMessage")).getText();

		 driver.close();
	}
	
	private static void invalidpassword() {
		
		 FirefoxDriver driver = openPage();
		 driver.findElement(By.id("txtUsername")).sendKeys("admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("tins");
		 driver.findElement(By.id("btnLogin")).click();
		 String error = driver.findElement(By.id("spanMessage")).getText();

		 driver.close();
	}
		
	private static FirefoxDriver openPage() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth");
		driver.manage().window().maximize();
		return driver;
	}

	public static void loginPage() {
		
		FirefoxDriver driver = openPage();

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		waitForJStoLoad(driver);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.close();
	}
	
	public static void searchemploye() { 
		FirefoxDriver driver = openPage();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		waitForJStoLoad(driver);
		
		WebElement pimElement = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
		Actions action = new Actions(driver);
		action.moveToElement(pimElement).perform();
		driver.findElement(By.cssSelector("#menu_pim_viewEmployeeList")).click();
		waitForJStoLoad(driver);
		
		driver.findElement(By.xpath("//*[@id='empsearch_employee_name_empName']")).sendKeys("steven");
		driver.findElement(By.id("searchBtn")).click();
		waitForJStoLoad(driver);

		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
		driver.close();
	}
	
	public static boolean waitForJStoLoad(FirefoxDriver driver) {

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


