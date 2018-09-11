package Testing;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Datalogin {
	WebDriver d = new FirefoxDriver();

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "admin", "admin123" }, { "admin", "admin123" } };
	}

	@Test(dataProvider = "Authentication")
	public void f(String sUser, String sPassword) throws InterruptedException {
		// WebDriver d;
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.id("txtUsername")).sendKeys(sUser);
		d.findElement(By.id("txtPassword")).sendKeys(sPassword);
		d.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='welcome']")).click();
		d.findElement(By.linkText("Logout")).click();
		d.close();

	}

}
