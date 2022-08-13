package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		// Step:1 Connect with the BrowserDriver(exe file)

		WebDriverManager.chromedriver().setup(); // check for the version and download

		// Step:2 TO launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Step:3 Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// to maximize the browser
		driver.manage().window().maximize();
		//to wait for the driver to locate the element
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step :4 Enter the Username
		// If the value of the locator is not proper ,it thows the exception as
		// NoSuchElement
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		// Step :5 Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// step:6 Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step:7 Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Step:8 Click the Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Step:9 Confirm the title of my webpage
		String title = driver.getTitle();
		System.out.println(title);	
		
		//To close the browser
		//Thread.sleep(2000);
		//driver.close();

	}

}
