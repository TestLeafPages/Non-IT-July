package selinum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClicks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		/*
		 * WebElement drag =
		 * driver.findElement(By.xpath("//span[@class='ui-panel-title']")); Point
		 * location = drag.getLocation(); int x = location.getX(); int y =
		 * location.getY();
		 * 
		 * WebElement targetEle =
		 * driver.findElement(By.xpath("//p[text()='Drag to target']")); WebElement
		 * dropEle = driver.findElement(By.xpath("//p[text()='Drop here']")); WebElement
		 * testleafImg = driver.findElement(By.id("form:logo"));
		 * 
		 * act.dragAndDropBy(drag, x+20, y+30).perform();
		 * act.dragAndDrop(targetEle,dropEle).pause(300).perform();
		 * act.scrollToElement(testleafImg).perform();
		 */
		act.scrollByAmount(230, 350).perform();
		
		// moving the Ele1 to ele3  and elet4 to ele 6
		//act.dragAndDrop(Ele1,ele3).pause(300).dragAndDrop(ele4, ele6)

	}

}
