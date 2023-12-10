package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Qicon\\Lokesh\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");	
		//Retrieve page title
		System.out.println("Page title is "+driver.getTitle());
		//Retrieve current url
		System.out.println("page current url "+driver.getCurrentUrl());
		//browser back and forward
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		//refres the page
		//method1
		driver.navigate().refresh();
		//method2
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		//method3
		String url=driver.getCurrentUrl();
		driver.navigate().to(url);
		//maximize the browser
		driver.manage().window().maximize();
		//minimize the browser window with code - minimize method is not there
		driver.manage().window().setPosition(new Point(0,-1000));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
