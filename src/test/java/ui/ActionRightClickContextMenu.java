package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionRightClickContextMenu {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul//li[7]//a[text()='Context Menu']")).click();
		
		Actions action = new Actions(driver);
		
		WebElement click = driver.findElement(By.id("hot-spot"));
		
		Thread.sleep(2000);
		
		action.contextClick(click).build().perform();
		
		Thread.sleep(2000);
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}
