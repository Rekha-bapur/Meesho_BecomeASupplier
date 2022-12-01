package test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class startselling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\Installables\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait explicitWait = new WebDriverWait(driver,20);
        driver.get("https://www.meesho.com/");
        driver.findElement(By.xpath("//span[text()='Become a Supplier']")).click();
        driver.findElement(By.xpath("//a[@data-position='header']")).click();
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mui-1']")));
        driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("7013199653");
        driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath(" //input[@placeholder='Email Id']")).sendKeys("sandhya@gmail.com");
        driver.findElement(By.xpath("//input[@id='mui-4']")).sendKeys("Sandhya@07");
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@hovercolor='#30228A']")));
        driver.findElement(By.xpath("//button[@hovercolor='#30228A']")).click();
        Thread.sleep(5000);
        driver.quit();
        
        
      
     
	}

}
