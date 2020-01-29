package casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class productpurchase {

	public static WebDriver driver;
	@Given("^user open App$")
	public void AppOpen() {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@And("^click on Sign$")
	public void signin() {
		driver.findElement(By.linkText("SignIn")).click();
	}
	@And("^user enter credential$")
	public void validcredentials(DataTable dt) {
		List<String> crd=dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(crd.get(0));
		driver.findElement(By.name("password")).sendKeys(crd.get(1));
		driver.findElement(By.name("Login")).click();
	}
		@And("^click search button$")
		      public void prod(DataTable dt) {
				List<String> crd=dt.asList(String.class);
				driver.findElement(By.id("myInput")).sendKeys(crd.get(0));
		}
		@And("^find product$")
		public void abc()
		{
			driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
		}
		@And("^click on add to card$")
		public void added()
		{
			driver.findElement(By.linkText("Add to cart")).click();
		}
}
	
