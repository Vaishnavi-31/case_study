package casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;



public class Login {
public static WebDriver driver;
@Given("^User open TestMeApp$")
public void AppOpen() {
	System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@And("^click on Signin$")
public void signin() {
	driver.findElement(By.linkText("SignIn")).click();
}
@And("^user enter credentials$")
public void validcredentials(DataTable dt) {
	List<String> crd=dt.asList(String.class);
	driver.findElement(By.name("userName")).sendKeys(crd.get(0));
	driver.findElement(By.name("password")).sendKeys(crd.get(1));
	driver.findElement(By.name("Login")).click();
}

}


