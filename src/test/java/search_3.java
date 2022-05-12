import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_3 {
public static void main(String s[])
{
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"/Drivers/first/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/apple-iphone-se-white-64-gb/p/itma00a19e11c81b?pid=MOBFWQ6BGWDVGF3E&lid=LSTMOBFWQ6BGWDVGF3EVKKUOW&marketplace=FLIPKART&q=Apple+Iphone&store=tyy%2F4io&srno=s_1_10&otracker=search&otracker1=search&fm=Search&iid=3342f2c7-acb7-4ca0-9b77-fb15aba67d0b.MOBFWQ6BGWDVGF3E.SEARCH&ppt=dynamic&ppn=CART_PAGE&ssid=j0bzuy7a0g0000001650518943401&qH=383aa4c8b1c69f1c");
	//WebElement ele = driver.findElement(By.xpath("//div[@class=\"_2c7YLP UtUXW0 _6t1WkM _3HqJxg\"]//child::div[@class=\"_1YokD2 _2GoDe3\"]//child::div[@class=\"_1YokD2 _3Mn1Gg col-5-12 _78xt5Y\"]//child::button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
	//JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("arguments[0].click()", ele);
	WebElement element = driver.findElement(By.xpath("//div[@id='container']//div[@class=\"_2c7YLP UtUXW0 _6t1WkM _3HqJxg\"]//child::div[@class=\"_1YokD2 _2GoDe3\"]//child::div[@class=\"_1YokD2 _3Mn1Gg col-5-12 _78xt5Y\"]//child::button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().perform();

	/*driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Maths");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	WebElement matchingResult= driver.findElement(By.xpath(".//div[@class='aajZCb']//ul"));
	List<WebElement> listResult= matchingResult.findElements(By.xpath("//div[@class=\"_1YokD2 _2GoDe3\"]//div[@class=\"_1YokD2 _3Mn1Gg\"]//child::div[@class=\"_1AtVbE col-12-12\"]//*[contains(text(),\"SAMSUNG\")]"));
	System.out.println(listResult.size());
	//if you want to print matching results
	     for(WebElement results: listResult)
	       {
	         String value= results.getText();
	         System.out.println(value);
	       }
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);*/

	System.out.println("Completed");
}
}
