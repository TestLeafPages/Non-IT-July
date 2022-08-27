package selinum;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS", Keys.ENTER);
		WebElement To = driver.findElement(By.id("txtStationTo"));
		To.clear();
		To.sendKeys("MDU", Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		// identified the table
		driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));

		List<WebElement> rowCount = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int rsize = rowCount.size();
		// add to new String List
		List<String> trainNames = new ArrayList<String>();
		System.out.println("Train Names");
		for (int i = 1; i <= rsize; i++) {
			String text = driver
					.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]"))
					.getText();
			// System.out.println(text);
			trainNames.add(text);
		}

		System.out.println(trainNames);
		Collections.sort(trainNames);
		List<String> trains = new ArrayList<String>(trainNames);

		Set<String> UniqueT = new LinkedHashSet<String>(trainNames);
		System.out.println(UniqueT);

	}
}
