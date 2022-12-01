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

import pom_scripts.read_excel;

public class startselling1 {
	WebDriver driver=null;
	@DataProvider(name="testData")
	public String[][]getTestData() throws IOException{
		String[][]testdata=  read_excel.getMultipleData("Sheet3");
		return testdata;
		}
	
	@BeforeTest
	public void start()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\Installables\\chromedriver_win32\\chromedriver.exe");
	         driver=new ChromeDriver();
	}
	@Test(dataProvider="testData")
	public void test(String [] emailOrPhone) throws InterruptedException
	{
		driver.get("https://www.meesho.com/");
		  driver.manage().window().maximize();
		  WebDriverWait explicitWait = new WebDriverWait(driver,20);
		  driver.get("https://www.meesho.com/");
	        driver.findElement(By.xpath("//span[text()='Become a Supplier']")).click();
	        driver.findElement(By.xpath("//a[@data-position='header']")).click();
	        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mui-1']")));
	        driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("9880158812");
	        driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
	        Thread.sleep(15000);
	        driver.findElement(By.xpath(" //input[@placeholder='Email Id']")).sendKeys("deepakreddy08032@gmail.com");
	        driver.findElement(By.xpath("//input[@id='mui-4']")).sendKeys("Deepak@1999");
	        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@hovercolor='#30228A']")));
	        driver.findElement(By.xpath("//button[@hovercolor='#30228A']")).click();
	        Thread.sleep(5000);
	        driver.quit();
	        
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
