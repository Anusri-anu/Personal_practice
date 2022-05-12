import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waits_2 {
	public static void main(String s[])
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/first/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id='menu']//*[contains(text(),'Phones')]")).click();
		driver.findElement(By.xpath("//*[@class=\"caption\"]//*[contains(text(),'HTC')]")).click();
		driver.findElement(By.xpath("//*[@id=\"product\"]//button[@id=\"button-cart\"]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Completed");
		driver.close();
		
	}

}
