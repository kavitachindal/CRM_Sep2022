package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
	
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavit\\Selenium\\crm\\driver\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	//for google search tab/input
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	//click on actual google search tab 
	driver.findElement(By.name("btnK")).click();
	
	//pause for 3 sec.
	Thread.sleep(3000);
	driver.close();
	}
}
