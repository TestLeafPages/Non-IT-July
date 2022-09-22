package week6day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForeletoInvisible {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		 driver.get("https://www.leafground.com/waits.xhtml");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));		 	 
		 WebElement eleinVisibility =driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		 wait.until(ExpectedConditions.invisibilityOf(eleinVisibility));
		 
		 
		 
		 
		 
		 
		 
		
		
		

	}

}
