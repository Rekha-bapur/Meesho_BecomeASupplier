package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ReadExcel;
import pom_scripts.read_excel;

public class loginmeesho1 {
	public WebDriver driver = null;

	@BeforeTest
	public void start()

	{
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/ADMIN/git/ELF_BASE_FRAMEWORK/Base_Framework_ELF/src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "testData")
	public void test(String[] data) throws InterruptedException {
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//span[text()='Become a Supplier']")).click();
		driver.findElement(By.xpath("//a[@id='loginbutton']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='emailOrPhone']")));
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("bapur.rekha@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rekha@07");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

	@DataProvider(name = "testData")
	public String[][] getTestData() throws IOException {
		String[][] testdata = read_excel.getMultipleData("Sheet1");
		return testdata;
	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
