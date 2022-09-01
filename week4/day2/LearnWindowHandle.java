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

public class LearnWindowHandle {

	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		System.out.println(driver);

		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		String Ptitle = driver.getTitle();	
		System.out.println(Ptitle);
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		//get the address of the all opened windows
		Set<String> windowHandles = driver.getWindowHandles();
		/*int size = windowHandles.size();
		System.out.println(size);
		
		for(String wh:windowHandles) {
		  System.out.println(wh);				
		}*/
	//	convert set to list
		List<String> switchTOWindow=new ArrayList<String>(windowHandles);
		//switch to the required child window
		driver.switchTo().window(switchTOWindow.get(1));
		String title = driver.getTitle();	
		System.out.println(title);
		driver.findElement(By.xpath("//li[@role='menuitem']//a")).click();
		driver.close();//closes the current active window
		//switch back to parent window to bring the control driver to parent
		driver.switchTo().window(switchTOWindow.get(0));
		
		//to take the screen shot for particular webElement
		WebElement windowClick = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		File src = windowClick.getScreenshotAs(OutputType.FILE);
		//creating runtime path/file to store the screenshot
		File des=new File("./Image/shot1.jpg");
		FileUtils.copyFile(src, des);			
		windowClick.click();
				
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> switchTOWindow1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(switchTOWindow1.get(2));
		String title2 = driver.getTitle();
		System.out.println(title2);
		//take the screen shot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//creating runtime path/file to store the screenshot
		File dest=new File("./Image/shot.jpg");
		FileUtils.copyFile(source, dest);		
		driver.close();
		//take the screen shot
		
		
		
		
		
		driver.quit();//close all the avilable/opened window
		
		
		
		
		
		
		
	}

}
