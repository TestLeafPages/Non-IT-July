package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='form:j_idt89:globalFilter']")).sendKeys("India");
		Thread.sleep(2000);
		// Step:1 Find the table and retreiving the data of 1row and 1 col
		String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td[1]")).getText();
		System.out.println(text);
		// to get the number of Rows(Count)
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		int rsize = rowCount.size();
		System.out.println("Number of Rows" + rsize);

		// to number of Columns (Count)
		List<WebElement> colCount = driver.findElements(By.xpath("//thead[@id='form:j_idt89_head']/tr/th"));
		int csize = colCount.size();
		System.out.println("Number of colmns :" + csize);

		System.out.println("*********************");
		// to get the particular row Value
		for (int i = 1; i <= csize; i++) {
			String SecRowValues = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[2]/td[" + i + "]"))
					.getText();
			System.out.println(SecRowValues);

		}
		System.out.println("*********************");

		// to get the particular col Value
		for (int i = 1; i <= rsize; i++) {
			String firstColValues = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[" + i + "]/td[1]"))
					.getText();
			System.out.println(firstColValues);

		}
		System.out.println("*********************");

		// to get all the values from the table

		for (int i = 1; i <= rsize; i++) {
			for (int j = 1; j <= csize; j++) {
				String allValues = driver
						.findElement(By.xpath("//table[@role='grid']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(allValues);

			}

		}
	}

}
