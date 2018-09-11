package Testing;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class dropdown {
	FirefoxDriver driver = new FirefoxDriver();

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
	}

	@Test
	public void f() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.linkText("Thomas")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input")).click();

		WebElement dd = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[3]/li[3]/select"));
		Select nations = new Select(dd);
		System.out.println("Default selection option" + nations.getFirstSelectedOption().getText());
		List<WebElement> countries = nations.getOptions();

		int i = 0;
		for (WebElement we : countries) {
			System.out.println(i + "." + we.getText());
			i++;
		}

		// nations.selectByIndex(82);
		// System.out.println("Selected option:
		// "+nations.getFirstSelectedOption().getText());
		// nations.selectByValue("82");
		// System.out.println("Selected option:
		// "+nations.getFirstSelectedOption().getText());
		// nations.selectByVisibleText("Indian");
		// System.out.println("Selected option:
		// "+nations.getFirstSelectedOption().getText());
	}

	@AfterTest
	public void afterTest() {
		driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
