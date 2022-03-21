package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* Learnt webdriver manager*/
		/*by adding webdrivermanager dependency in the pom file , there is no need to install the browserdriverss*/
		
	/*WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver()*/;
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.close();
	}

}
