package week4day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// click the Webelement
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();

		// transfer the control to alert box

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		
		//Prompt dialog
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		alert.sendKeys("Demo");
		alert.accept();
		String userEnteredName = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(userEnteredName);
		// sweet Alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
