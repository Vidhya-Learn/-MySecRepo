package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
	driver.get("https://www.facebook.com/r.php");
	driver.manage().window().maximize();
	WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	firstname.sendKeys("Testing");
	driver.navigate().refresh();
	Thread.sleep(200);
	firstname.sendKeys("Vidhya");

	}

}
