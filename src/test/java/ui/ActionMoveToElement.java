package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		//driver.findElement(By.xpath("//a[@href='/hovers']")).click();
		
		//WebElement hover = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		///WebElement hover2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
		
		
		WebElement draganddrop =  driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		
		draganddrop.click();
		
		WebElement drag = driver.findElement(By.id("column-a"));
		WebElement drop = driver.findElement(By.id("column-b"));
		
		Actions action = new Actions(driver);
		
		//action.moveToElement(hover).perform();
		
		//Thread.sleep(2000);
		//action.moveToElement(hover2).perform();

		action.clickAndHold(drop).moveToElement(drag).release().build().perform();
		
		
		
		//action.dragAndDrop(drop, drag).perform();
		
		//driver.close();
		
	}

}
