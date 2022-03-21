package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		/*Select the checkbox 1*/
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		Thread.sleep(2000);
		/*Select the checkbox 2*/
		driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected());
		
		
		
		

	}

}
