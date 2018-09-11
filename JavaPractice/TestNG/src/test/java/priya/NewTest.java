package priya;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

//import java.util.List;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;

public class NewTest {

	WebDriver d = new FirefoxDriver();

	@BeforeTest
	public void beforeTest() {
		d.manage().window().maximize();
		d.get("http://localhost:8080/login.do;jsessionid=p9e1whw1m5sn");
		d.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		d.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input"))
				.sendKeys("manager");
		d.findElement(By.xpath(".//*[@id='loginButton']/div")).click();
	}

	@Test
	public void f() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.id("leaveButton_2_mainContentTd")).click();
		d.findElement(By.id("LeavePopupRadio_NoLeave")).click();

	}

	@AfterTest
	public void afterTest() {
		d.findElement(By.xpath(".//*[@id='logoutLink']")).click();

		d.close();
	}

}
