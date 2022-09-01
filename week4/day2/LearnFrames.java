package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		System.out.println(driver);
		
		  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  //to handle the frame ->switch to frame using webelement WebElement frameEle
		  driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe"));
		  //driver.switchTo().frame(frameEle); driver.switchTo().frame("iframeResult");
		  
		  driver.findElement(By.xpath("//button[text()='Try it']")).click();
		  driver.switchTo().alert().accept(); String text =
		  driver.findElement(By.id("demo")).getText(); System.out.println(text);
		 
		
	}

}
