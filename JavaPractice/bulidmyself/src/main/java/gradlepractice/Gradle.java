package gradlepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gradle {
	
	@Test
	public void login() {
		FirefoxDriver driver = openPage();
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		driver.close();
	}
	
	private FirefoxDriver openPage() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth");
		driver.manage().window().maximize();
		return driver;
	}
}
