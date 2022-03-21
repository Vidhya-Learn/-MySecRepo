package Herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String Text  = driver.findElement(By.xpath("//div/h3")).getText();
		
		
		
		System.out.println(Text);
		if(Text.equals("Basic Auth")) {
			System.out.println("Basic Auth Worked");
		}
		else
		{ System.out.println("Mistake in Basic Auth coding");
		
		}
		
		driver.close();
			
	}

}
