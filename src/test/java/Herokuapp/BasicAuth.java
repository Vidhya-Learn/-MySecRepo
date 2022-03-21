package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String HeadText = driver.findElement(By.xpath("//div/h3")).getText();
		String Text = driver.findElement(By.xpath("//div/p")).getText();
		System.out.println(HeadText);
		System.out.println(Text);
		
	}

}
