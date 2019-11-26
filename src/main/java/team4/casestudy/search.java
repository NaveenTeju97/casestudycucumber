package team4.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class search {
	WebDriver driver;
	 
	@Given("^open the browser and land in signin page$")
	public void open_the_browser_and_land_in_signin_page() throws Throwable {
		driver = Utilityclass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^user provides the valid credentials$")
	public void user_provides_the_valid_credentials() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");	  
		driver.findElement(By.name("password")).sendKeys("Password123");
		
	}

	@When("^clicks on login button and lands back in home page$")
	public void clicks_on_login_button_and_lands_back_in_home_page() throws Throwable {
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals("Home",driver.getTitle());
	}

	@When("^Type the first four letters of the product$")
	public void type_the_first_four_letters_of_the_product() throws Throwable {
		 Actions act=new Actions(driver);
		 act.sendKeys(driver.findElement(By.id("myInput")),"h").pause(1000).sendKeys("e").pause(1000).sendKeys("a").pause(1000).sendKeys("d").build().perform();
	}

	@When("^Select the product from the dropdown$")
	public void select_the_product_from_the_dropdown() throws Throwable {
		Actions act=new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div"))).click().build().perform();
	}

	@When("^Click on find details$")
	public void click_on_find_details() throws Throwable {
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("^The product information is displayed$")
	public void the_product_information_is_displayed() throws Throwable {
	  Assert.assertEquals("Search",driver.getTitle());
	}
}