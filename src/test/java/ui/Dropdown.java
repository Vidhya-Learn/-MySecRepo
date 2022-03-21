package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://the-internet.herokuapp.com/");
		 * driver.findElement(By.xpath("//a[@href='/dropdown']")).click(); WebElement
		 * ddown = driver.findElement(By.cssSelector("select#dropdown"));
		 * 
		 * Select select= new Select(ddown);
		 * 
		 * select.selectByIndex(2); Thread.sleep(2000);
		 * 
		 * select.selectByValue("1");; Thread.sleep(2000);
		 * 
		 * select.selectByVisibleText("Option 2");
		 * 
		 * driver.close();
		 */	
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		/*
		 * SelectFromDropDownByValue(month,"7"); SelectFromDropDownByValue(day,"11");
		 * SelectFromDropDownByValue(year,"1989");
		 */
		
		List <WebElement> allmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		int monthcount = allmonth.size();
		System.out.println("The number of months is " + monthcount);
		
		for (int i=0; i<=monthcount; i++){
			String monthname = allmonth.get(i).getText();
			System.out.println(monthname);
			if(monthname.equals("Jul")){
				allmonth.get(i).click();
				break;
			}
				
				
				
			}
			
		}
		
				
	
	
	public static void SelectFromDropDownByValue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}

	
	
	
	
}
