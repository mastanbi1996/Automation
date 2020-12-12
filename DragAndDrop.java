package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sshaik53\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://jqueryui.com/droppable/");
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
		/*action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")id("draggable")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")id("droppable"))).
		release().
		build().
		perform();*/
		driver.close();
		
	}

}
