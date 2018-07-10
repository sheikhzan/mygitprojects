package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest{
	public WebDriver driver;
	@Test
	public void openBlog() {
		driver.get("https://www.softwaretestingmaterial.com/");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","F:\\Personal\\Selenium_essentials\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}