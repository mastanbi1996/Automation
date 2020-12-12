package example1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sshaik53\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mastanbi.shaik7@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("M@6309479592");
    driver.findElement(By.xpath("//button[@name='login']"));
    List<WebElement> linklist = driver.findElements(By.tagName("a"));
    linklist.addAll(driver.findElements(By.tagName("img")));
    List<WebElement> activelinks = new ArrayList<WebElement>();
    for(int i=0;i<linklist.size();i++) {
    	if(linklist.get(i).getAttribute("href")!= null)
    	{
    		activelinks.add(linklist.get(i));
    		
    	}
    		
    	
    }
    
    for(int j=0;j<activelinks.size();j++)
    {
    	HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
    	connection.connect();
    	String response = connection.getResponseMessage();
    	connection.disconnect();
    	System.out.println(activelinks.get(j).getAttribute("href")+response);
    	

    	
    }
    



	}

}
