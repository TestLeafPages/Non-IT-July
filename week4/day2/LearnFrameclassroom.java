package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameclassroom {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to handle the frame
		driver.switchTo().frame(0);
		// click the Webelement		
		WebElement firstframEle = driver.findElement(By.id("Click"));
		firstframEle.click();
		String text = firstframEle.getText();
		System.out.println(text);
		//take the driver control out of the frame
		driver.switchTo().defaultContent();
		
		
		
		//to handle the nested frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement nestedframEle = driver.findElement(By.id("Click"));
		nestedframEle.click();
		String nestedframe = nestedframEle.getText();
		System.out.println(nestedframe);
		driver.switchTo().defaultContent();

	}

}
