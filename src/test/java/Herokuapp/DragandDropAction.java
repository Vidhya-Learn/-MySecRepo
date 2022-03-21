package Herokuapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul/li/a[text()='Drag and Drop']")).click();
		
		WebElement Source = driver.findElement(By.xpath("//div[@id = 'column-a']"));
		
		WebElement Target = driver.findElement(By.xpath("//div[@id = 'column-b']"));
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		//WebDriverWait wait = new WebDriverWait(driver,2);
		
		//wait.until(ExpectedConditions.elementToBeSelected(Target));
		
		action.clickAndHold(Source).moveToElement(Target).release().build().perform();
		
		//action.dragAndDrop(Source, Target);
		
		//action.clickAndHold(Target).moveToElement(Source).release().build().perform();
		
		
		
		
		
		
		

	}

}
