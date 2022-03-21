package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href = '/windows']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href = '/windows/new']")).click();
		Set<String> windowHandles =  driver.getWindowHandles();
		 Iterator <String> iterator =  windowHandles.iterator();
		 
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		
		 
		
		
		
		
			}

}
