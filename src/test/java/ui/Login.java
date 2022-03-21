package ui;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe"); 
		 * ChromeDriver driver = new Chromedriver();
		 * ChromeDriver(); driver.get("http://google.com");
		 */		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\browserdrivers\\geckodriver.exe"); FirefoxDriver driver = new
		 * FirefoxDriver(); driver.get("http://google.com");
		 */		
		//System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://google.com");
	}

}
