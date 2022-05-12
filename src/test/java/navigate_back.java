import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_back {
public static void main(String s[])
{
	String paths=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", paths+"/Drivers/first/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/insurance/v1/index.php");
	//driver.findElement(By.xpath("//*[contains(text(),'Project')]"));
	List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Project')]"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i)+" Page");
		List<WebElement> list1 = driver.findElements(By.xpath("//*[contains(text(),'Project')]"));
	list1.get(i).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.navigate().back();
	}
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Completed");
	driver.close();
}
}
