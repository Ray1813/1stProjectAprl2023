package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework2 {
	
	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}

	@Test
	public void browser() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Wait for the overlay to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loader-overlay.loaded")));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Transactions")))).click();

		driver.findElement(By.linkText("New Deposit")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("select2-account-container")))).click();

		driver.findElement(By.id("select2-account-container")).click();
		//driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("2000000");
		//driver.findElement(By.cssSelector("input[id='account_number']")).sendKeys("43453423");
		//driver.findElement(By.xpath("//input[@name='contact_person']")).sendKeys("Ramon");
		//driver.findElement(By.cssSelector("input[name='contact_phone']")).sendKeys("4032134444");
		//driver.findElement(By.id("ib_url")).sendKeys("www.techfios.com");
		//driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']")).click();

	
}
}