package Herokuapp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	 
	WebElement Windows = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
	Windows.click();
    WebElement NavChild = driver.findElement(By.xpath("//a[text()='Click Here']"));
	
	NavChild.click();
	
	Set<String> Winhan = driver.getWindowHandles();
	Iterator<String> It = Winhan.iterator();
	
	String ParentWindow = It.next();
	String ChildWindow = It.next();
	
	
	//String Childtitle = driver.getTitle();
	//System.out.println("ChildWndow Tiltle is" +Childtitle);
	//Child Window Verification//
	//if(Childtitle.equals("New Window"))
	//{
		//System.out.println("Child Window Verification - We are in ChildWindow");
	//}else
	//{
		//System.out.println("Child Window Verification - We are not in ChildWindow");
	//}
	
	
	driver.switchTo().window(ParentWindow);
	
	String ParentElement = driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText();
	System.out.println("PArent Window Heading is " +ParentElement);
	
	while(ParentElement.equals("Opening a new window"))
	{
		System.out.println("Par Wind Verification - WE are in Parent Window");
		break;
	}
	
	Thread.sleep(5000);
	
	driver.switchTo().window(ChildWindow);
	
	driver.quit();
	
		
	}

}
