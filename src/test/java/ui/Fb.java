package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
	driver.get("https://www.facebook.com/r.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Testing");
	driver.findElement(By.name("lastname")).sendKeys("name");
	driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("9378253536");
	driver.findElement(By.id("password_step_input")).sendKeys("abc123");
	
	WebElement month = driver.findElement(By.id("month"));
	WebElement day = driver.findElement(By.id("day"));
	WebElement year = driver.findElement(By.id("year"));
	
	
	selectFromDropDown(month,"Jul");
	selectFromDropDown(day,"11");
	selectFromDropDown(year,"1989");
	
//	selecting radio button
	
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
	//Thread.sleep(2000);
	//System.out.println(driver.findElement(By.xpath("//input[@type='radio'][contains(@value,'1')]")).isSelected());
	//System.out.println(driver.findElement(By.xpath("//input[@type='radio'][contains(@value,'2')]")).isSelected());
	List <WebElement> gender = driver.findElements(By.xpath("//span[@data-type='radio']/span"));
	System.out.println(gender.size());
	SelectGenderRadioButton(gender,"Male");
	
		
	
	
	}
	
	
	public static void selectFromDropDown(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	
	public static void SelectGenderRadioButton(List<WebElement> gender,String gendervalue)
	{
	for (int i=0; i<=gender.size();i++ )
	{
		gender.get(i).getText();
	if(gender.get(i).getText().equals(gendervalue))
	{
		gender.get(i).click();
		break;
	}
		
	}

	}
}


