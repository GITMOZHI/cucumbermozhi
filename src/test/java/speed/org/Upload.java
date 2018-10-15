package speed.org;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Upload {
	static WebDriver driver;
	
	@Given("^user is on netflix speed page$")
	public void user_is_on_netflix_speed_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\mozhi\\Seleniumcucumber\\exedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.get("https://www.netflix.com/in/");
		//driver.findElement(By.xpath("//span[text()='Speed Test']")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://fast.com/");
		Thread.sleep(9000);
	    System.out.println("wait s over");
	
	}

	@When("^check net speed$")
	public void check_net_speed() throws InterruptedException {
	  // String name= driver.findElement(By.id("speed-value")).getAttribute("value");
		System.out.println("to check upload speed");
		//Thread.sleep(5000);
		System.out.println("Still waiting for speed check");
		
		
		String current=driver.getCurrentUrl();
		System.out.println(current);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String refresh=driver.findElement(By.xpath("//div[contains(text(),'Your Internet')]")).getText();
		
		System.out.println(refresh);
		Thread.sleep(9000);
		
	if(refresh.equals("Your Internet speed is"));
		{
		String name= driver.findElement(By.id("speed-value")).getText();
	    System.out.println("Your Internet speed is"+name);
		}
	
	}
	
	@Then("^check the net speed printed$")
	public void check_the_net_speed_printed() {
	    //Assert.assertEquals(89, name);
	    
	}



}
