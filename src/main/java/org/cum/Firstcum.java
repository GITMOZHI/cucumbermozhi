package org.cum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
/*
public class Firstcum {
        static WebDriver driver;
	
	/*@Given("^the user add new customer page$")
	public void the_user_add_new_customer_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\mozhi\\Seleniumcucumber\\exedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");

	   driver.findElement(By.name("uid")).sendKeys("mngr157044");
	   driver.findElement(By.name("password")).sendKeys("huhYpyp");
	   driver.findElement(By.name("btnLogin")).click();
	   driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
	   
	   
	   
	}

	//@When("^the user enters the details$")
	public void the_user_enters_the_details() {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("arun");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		  driver.findElement(By.id("dob")).sendKeys("14-08-1990");
		
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("raj street chennai");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("chennai");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("tn");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("456980");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("asd45@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123");
		
	}

	//@When("^the user clicks the submit button$")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}

	@Then("^the user should see the success message$")
	public void the_user_should_see_the_success_message() {
	  Assert.assertEquals("Customer Registered Successfully!!!", driver.findElement(By.tagName("p")).getText());
	}


}*/
