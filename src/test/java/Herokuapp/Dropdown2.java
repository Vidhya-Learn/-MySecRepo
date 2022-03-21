package Herokuapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		WebElement dropdown  = driver.findElement(By.xpath("//ul/li/a[@href = '/dropdown']"));
		dropdown.click();
		
		WebElement ddown = driver.findElement(By.id("dropdown"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select select = new Select(ddown);
		
		select.selectByIndex(1);
		select.selectByValue("2");
		
	}

}
