package casestudy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logintest {
	public static WebDriver driver;
	@When("^user open TestMeApp$")
	public void AppOpen() {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@And("^click on SignUp$")
	public void signup() {
		driver.findElement(By.linkText("SignUp")).click();
	}
	
	@And("^enter name as \"([^\"]*)\"$")
	public void name(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);	
	}
	
	@And("^enter fname as \"([^\"]*)\"$")
	public void firstname(String fname) {
		driver.findElement(By.id("firstName")).sendKeys(fname);
	}
	@And("^enter lname as \"([^\"]*)\"$")
	public void lastname(String lname) {
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
	}
	@And("^enter password as \"([^\"]*)\"$")
	public void password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@And("^enter confirm password as \"([^\"]*)\"$")
	public void confirmfirstname(String confirm) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(confirm);
		
	}
	@And("^enter gender as \"([^\"]*)\"$")
	public void gender(String gender) {
		//List <WebElement> allradiobuttons=driver.findElements(By.name("gender"));
	//	allradiobuttons.get(1).click();
	//driver.findElement(By.id("gender")).click();
		if(gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		}
		else if(gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		}
	}
	
	@And("^enter email as \"([^\"]*)\"$")
	public void email(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
		
	}
	@And("^enter mobile number as \"([^\"]*)\"$")
	public void MobNum(String MobNum) {
		
		driver.findElement(By.id("mobileNumber")).sendKeys(MobNum);
	}
	@And("^enter DOB as \"([^\"]*)\"$")
	public void DOB(String birthdate) {
		
		driver.findElement(By.id("dob")).sendKeys(birthdate);
	}
	
	@And("^enter Address as \"([^\"]*)\"$")
	public void adress(String address) {
		driver.findElement(By.id("address")).sendKeys(address);
		
	}
	@And("^enter security question as \"([^\"]*)\"$")
	public void Question(String que)
	{
		
		WebElement dropdown= driver.findElement(By.name("securityQuestion"));
		
		   Select s =new Select(dropdown);
		   driver.findElement(By.id("securityQuestion")).sendKeys(que);
		   	//s.selectByIndex(2);
	}
	@And("^enter answer as \"([^\"]*)\"$")
	public void Answer(String ans)
	{
		driver.findElement(By.id("answer")).sendKeys(ans);
	}
	
	@Then("^registered$")
	public void Register()
	{
		driver.findElement(By.name("Submit")).click();
	}
	

}
