package example1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sshaik53\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		// to get total number of links on page and get text of each link on page
		List <WebElement> linklists = driver.findElements(By.tagName("a"));
		System.out.println(linklists.size());
		for(int i=0;i<linklists.size();i++) {
			String linktext = linklists.get(i).getText();
			System.out.println(linktext);
		}
		driver.close();
		
		
		

	}

}
