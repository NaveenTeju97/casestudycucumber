package team4.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class add2cart {
	WebDriver driver;
	@Given("^Open the browser and land in signin page$")
	public void open_the_browser_and_land_in_signin_page() throws Throwable {
		driver = Utilityclass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User provides the valid credentials$")
	public void user_provides_the_valid_credentials() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");	  
		driver.findElement(By.name("password")).sendKeys("Password123");
	}

	@When("^Clicks on login button and lands back in home page$")
	public void clicks_on_login_button_and_lands_back_in_home_page() throws Throwable {
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals("Home",driver.getTitle());
	}

	@When("^Type the product name$")
	public void type_the_product_name() throws Throwable {
		driver.findElement(By.id("myInput")).sendKeys("headphone");
	}

	@When("^Clicks on find details$")
	public void clicks_on_find_details() throws Throwable {
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("^The product's information is displayed$")
	public void the_product_s_information_is_displayed() throws Throwable {
		 Assert.assertEquals("Search",driver.getTitle());
	}

	@When("^click on add to cart$")
	public void click_on_add_to_cart() throws Throwable {
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("^checks if page lands in add to cart$")
	public void checks_if_page_lands_in_add_to_cart() throws Throwable {
	   Assert.assertEquals("View Cart",driver.getTitle());
	}
}
