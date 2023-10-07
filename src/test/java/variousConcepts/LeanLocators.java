package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LeanLocators {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://objectspy.space/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testLocators() {

		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();

		// Upload file

		// Robot class if the tag in other than <input>

		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\sinda\\Selenium\\1stSelenium\\bin\\launchBrowser");

		// Link Text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();

		// To go back on the site.

		driver.navigate().back();

		// partial link test

		//driver.findElement(By.partialLinkText("TF-API")).click();
		
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Ramon");
		driver.findElement(By.cssSelector("input#exp-3")).click();
		driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/']")).click();

	}
}
