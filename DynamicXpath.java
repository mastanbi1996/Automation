package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sshaik53\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies(); 
driver.get("https://www.ebay.com/");
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dresses");
//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("dresses");
//driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("dresses");
driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();




	}

}
