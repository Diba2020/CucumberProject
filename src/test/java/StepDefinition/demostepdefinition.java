package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demostepdefinition {
WebDriver driver;

@Given("open the amazonsite")
	public void open_the_amazonsite() {
		 System.out.println("launching browser");
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shafi\\Documents\\geckodriver.exe");
	    	 driver = new FirefoxDriver();
	    	 driver.get("https://www.amazon.com/");
	    	 driver.manage().window().maximize();
	     	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

@When("enter the text in search box")
	public void enter_the_text_in_search_box() 
{
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.sendKeys("iPhone 13 Pro Max case");
	searchBox.submit();
	driver.findElement(By.linkText("Cell Phone Cases & Covers")).click();
	driver.findElement(By.linkText("Any Department")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	driver.findElement(By.linkText("Children's Books")).click();
	
	}

@When("i click the enter")
	public void i_click_the_enter()
 {
 
	System.out.println("enter after putting all the values");
}

@Then("when i click on links")
	public void when_i_click_on_links()
 {
System.out.println("click on the links ");

	}

@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
System.out.println("the results is showing ");
	}

	
	
	
}
