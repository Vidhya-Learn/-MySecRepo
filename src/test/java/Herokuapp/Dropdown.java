package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static WebDriver driver;
	public static String browser="Firefox";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initiate Browser in chrome and Firefox//
		if (browser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		else if (browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();  //used text() xpath//
		//driver.findElement(By.linkText("Form Authentication")).click();   //locator used is linkText//		
		//driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();
		driver.findElement(By.xpath("//i[contains(@class,'signout')]")).click(); //used xpath function 'contains'//
		//driver.quit();
		
	}

}
