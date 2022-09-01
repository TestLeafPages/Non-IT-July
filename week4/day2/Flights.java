package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flights {

	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		System.out.println(driver);

		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//click the alert handle as normal click..sweet alert
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> switchTOWindow=new ArrayList<String>(windowHandles);
		//switch to the required child window
		driver.switchTo().window(switchTOWindow.get(1));
		String title = driver.getTitle();	
		System.out.println(title);
		driver.close();		
		driver.quit();
		
		
		
		
	}

}
