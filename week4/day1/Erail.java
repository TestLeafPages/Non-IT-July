package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		WebElement To = driver.findElement(By.id("txtStationTo"));
		To.clear();
		To.sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		//identified the table
		driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tr"));
		int rsize = rowCount.size();
		
		System.out.println("Train Names");
		for(int i=1;i<=rsize;i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tr["+i+"]/td[2]")).getText();
			System.out.println(text);
		}
		
		
	}

}
