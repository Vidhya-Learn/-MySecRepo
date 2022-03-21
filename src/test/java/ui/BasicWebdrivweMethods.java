package ui;

import java.util.List;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdrivweMethods {
	
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

		  
		driver.get("https://www.saucedemo.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource= driver.getPageSource();
		System.out.println(pagesource);
		
		driver.findElement(By.xpath("//*[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input.input_error[placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.close();
		
		
		
		
		
		
		
		
		 	}
	

	

}