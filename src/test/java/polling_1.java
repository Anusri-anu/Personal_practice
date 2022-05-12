import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class polling_1 {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/Drivers/first/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestingplayground.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Load')]")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(60))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		driver.close();


	}

}
