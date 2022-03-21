package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul/li[8]//a/span[text()='Get A Demo']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[name='firstname']")).clear();
		String attribute = driver.findElement(By.xpath("//select[contains(@class,'element-container')]")).getAttribute("name");
		System.out.println(attribute);
		Dimension size = driver.findElement(By.xpath("//select[contains(@class,'element-container')]")).getSize();
		System.out.println(size);
		System.out.println(driver.findElement(By.xpath("//select[contains(@class,'element-container')]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//ul/li[8]//a/span[text()='Get A Demo']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@type='submit']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@type='submit']")).isDisplayed());
		driver.close();
	
	}

}
