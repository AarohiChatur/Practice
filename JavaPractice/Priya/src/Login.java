package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Login {
	WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void beforeTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void f() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		String s = driver.findElement(By.id("spanMessage")).getText();
		System.out.println(s);

	}

	@AfterTest
	public void afterTest() {
		driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
