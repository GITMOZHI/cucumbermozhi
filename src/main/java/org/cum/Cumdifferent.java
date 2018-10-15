package org.cum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cumdifferent {
	
	static WebDriver driver;
	@Given("^the user is in guru login page$")
	public void the_user_is_in_guru_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\mozhi\\Seleniumcucumber\\exedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");

	}

	@Given("^the user login and navigates to add customer page$")
	public void the_user_login_and_navigates_to_add_customer_page() {

		   driver.findElement(By.name("uid")).sendKeys("mngr157044");
		   driver.findElement(By.name("password")).sendKeys("huhYpyp");
		   driver.findElement(By.name("btnLogin")).click();
		   driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
	}

	@When("^user enter the customer details \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter_the_customer_details(String name, String gen, String dob, String address, String city, String state, String pin, String mobile, String email, String pass) {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		 driver.findElement(By.id("dob")).sendKeys(dob);
		
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys(address);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(city);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(state);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(pin);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(mobile);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(email);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pass);
		
	}

	@When("^user clicks the reset button$")
	public void user_clicks_the_reset_button() {
		driver.findElement(By.name("res")).click();
	}

	@Then("^the user should be in customer page$")
	public void the_user_should_be_in_customer_page() {
	   
	}




	
}
