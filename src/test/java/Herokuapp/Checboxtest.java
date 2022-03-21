package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checboxtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		WebElement checkbox = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
		checkbox.click();
		//Checking the checkbox1//
		driver.findElement(By.xpath("//input[@type ='checkbox'][1]")).click();
		//deselecting checkbox2//
		driver.findElement(By.xpath("//input[@type ='checkbox'][2]")).click();
		driver.quit();
		
		

	}

}
