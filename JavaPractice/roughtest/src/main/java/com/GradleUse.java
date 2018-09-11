package com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GradleUse {
	   
  //  @Test
	public void userNameTest() {
		FirefoxDriver driver = openPage();
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	    driver.close();
	}
	
	@Test
	// AccessModifier [static] Type name([parameters])
	public void constructorTest() {
		// Type name = value of Type
	//	int i = getValue();
		//LearnConstructor objectA = new LearnConstructor("Vivek", 23);
		//LearnConstructor objectB = new LearnConstructor("Tins", 28);
		 
		//System.out.println("Is "+ objectA.getName() + " older than " + objectB.getName() +" : " + objectA.isOlderThan(objectB));
		
		// double b = LearnConstructor.area(36);
	//	double b1= LearnConstructor.area(36,4);
	//	System.out.println("area: "+ b);
	//	System.out.println("area: "+ b1);
		
	
		Pizza largePizza = new Pizza("Farmhouse","CheeseCrust","Mushroom",12,300);
		Pizza smallPizza = new Pizza("Margerita","Italian","BlackOlive",6,50);
		Pizza mediumPizza =new Pizza("DoubleCheese","DoubleCheese","Cheeseplain",9,200);
		
		print(mediumPizza);
		print(smallPizza);
		print(largePizza);
		
		//System.out.println("Is "+ objectA.getName() + " older than " + objectB.getName() +" : " + objectA.isOlderThan(objectB));
		
		//double b = LearnConstructor.area(36);
		//double b1= LearnConstructor.area(36,4);
		//System.out.println("area: "+ b);
		//System.out.println("area: "+ b1);

	
	}
	
	public void print(Pizza pizza) {
		System.out.println("your pizza name is: " +pizza.getName()+ "\nsize is: "+pizza.getSize()+"\nbase is: " +pizza.getBase()+ "\ntoppins is: "+ pizza.getTopings()+"\nprice is: "+pizza.getPrice());
	}
	
	private FirefoxDriver openPage() {
		FirefoxDriver driver = new FirefoxDriver();	   
		driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
		return driver;
	}
}
