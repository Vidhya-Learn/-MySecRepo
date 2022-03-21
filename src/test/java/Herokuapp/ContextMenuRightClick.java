package Herokuapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextMenuRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul/li/a[text()='Context Menu']")).click();
		
		String CurrentUrl = driver.getCurrentUrl();
		
		System.out.println(CurrentUrl);
		
		System.out.println(driver.getTitle());
		
		String Heading = driver.findElement(By.xpath("//div/h3")).getText();
		
		if (Heading.equals("Context Menu"))
		{
			System.out.println("Current Url is correct");
		}else
		{
			System.out.println("Incorrect Page");
		}
		
		WebElement RightClick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(RightClick).build().perform();
		
		//driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.quit();
	
	}
		}
		
			