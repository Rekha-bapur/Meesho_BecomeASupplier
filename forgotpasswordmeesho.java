package test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forgotpasswordmeesho {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\Installables\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait explicitWait = new WebDriverWait(driver,20);
        driver.get("https://www.meesho.com/");
        driver.findElement(By.xpath("//span[text()='Become a Supplier']")).click();
        driver.findElement(By.xpath("//a[@id='loginbutton']")).click();
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='emailOrPhone']")));
        driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("bapur.rekha@gmail.com");
        driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();
        Thread.sleep(2000);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bapur.rekha@gmail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-button css-1puk0rd']")).click();
        driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("bapur.rekha@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rekha@07");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.quit();

	}

}
