package org.cum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Customercreate {
	static WebDriver driver;
	@When("^user enter the details  Customername and Gender and Date of Birth and  Address and City and State and PIN and Mobile Number and E-mail and Password|$")
	public void user_enter_the_details_Customername_and_Gender_and_Date_of_Birth_and_Address_and_City_and_State_and_PIN_and_Mobile_Number_and_E_mail_and_Password(DataTable credential) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\mozhi\\Seleniumcucumber\\exedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");

	   driver.findElement(By.name("uid")).sendKeys("mngr157044");
	   driver.findElement(By.name("password")).sendKeys("huhYpyp");
	   driver.findElement(By.name("btnLogin")).click();
	   driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
	   Thread.sleep(1000);
	   
	   List<List<String>> credentialslist=credential.asLists(String.class);
	   System.out.println(credentialslist);
	   driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(credentialslist.get(1).get(0));
		//driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		 //d driver.findElement(By.id("dob")).sendKeys("14-08-1990");
		
		//driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys(credentialslist.get(1).get(0));
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("chennai");
		//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("tn");
		//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("456980");
		//driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("9876543210");
		//driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("asd45@gmail.com");
		//driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123");
	   
	   
	   
	}

	@When("^click the submit button$")
	public void click_the_submit_button() {
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	    
	}

	@Then("^user see the success message$")
	public void user_see_the_success_message() {
	  
	}

	
}
