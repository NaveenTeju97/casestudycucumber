package team4.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class registration {
	WebDriver driver;
	@Given("^User opened the testme app and landed in the signup page$")
	public void user_opened_the_testme_app_and_landed_in_the_signup_page() throws Throwable {
		driver = Utilityclass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String arg1) throws Throwable {
	  driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^User enters the first name as \"([^\"]*)\"$")
	public void user_enters_the_first_name_as(String arg1) throws Throwable {
		driver.findElement(By.id("firstName")).sendKeys(arg1);
	}

	@When("^User provides second name as \"([^\"]*)\"$")
	public void user_provides_second_name_as(String arg1) throws Throwable {
		driver.findElement(By.id("lastName")).sendKeys(arg1);
	}

	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String arg1) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@When("^User confirms the password as \"([^\"]*)\"$")
	public void user_confirms_the_password_as(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^User selects the Male$")
	public void user_selects_the_Male() throws Throwable {
		driver.findElement(By.xpath("//input[@value= 'Male' and @type= 'radio']")).click();
	}

	@When("^User provides the mailid \"([^\"]*)\"$")
	public void user_provides_the_mailid(String arg1) throws Throwable {
		driver.findElement(By.id("emailAddress")).sendKeys(arg1);
	}

	@When("^User enters the mobilenum \"([^\"]*)\"$")
	public void user_enters_the_mobilenum(String arg1) throws Throwable {
		driver.findElement(By.id("mobileNumber")).sendKeys(arg1);
	}

	@When("^User enters the dob \"([^\"]*)\"$")
	public void user_enters_the_dob(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^User enters his city \"([^\"]*)\"$")
	public void user_enters_his_city(String arg1) throws Throwable {
		driver.findElement(By.id("address")).sendKeys(arg1);
	}

	@When("^User selects the Security question$")
	public void user_selects_the_Security_question() throws Throwable {
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(1);
	}

	@When("^User provides the answer as \"([^\"]*)\" for the question$")
	public void user_provides_the_answer_as_for_the_question(String arg1) throws Throwable {
		driver.findElement(By.id("answer")).sendKeys(arg1);
	}

	@When("^Click on Register button$")
	public void click_on_Register_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^User Registered succesfully$")
	public void user_Registered_succesfully() throws Throwable {
	  Assert.assertEquals("Login",driver.getTitle());
	  System.out.println("User registered successfully!!!!");
	}
}
