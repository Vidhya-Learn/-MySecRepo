package ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		/* Selects "From" Field"*/
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		from.sendKeys("Delhi, India");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		/* Selects "To" Field"*/ 
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		to.sendKeys("Chicago, United States");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);

		
		
		
		
		
		
		
		
		

	}

}
