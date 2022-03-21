package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWebdriverInterface {
	
	public static String browser = "Chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
		 /* Learnt webdriver Interface*/
		/*by adding webdrivermanager as an interface, there is no need to create separate decalration for driver for all browsers*/
		
		if (browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		else if (browser.equals("Chrome"))
		{
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
		}
	
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("standard_user");
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.close();
	}

}