import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automate_6 {
public static void main(String s[])
{
	String paths=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", paths+"/Drivers/first/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mytestingthoughts.com/Sample/home.html");
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Anusri");
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Gowtham");
	driver.findElement(By.xpath("//input[@value='Female']")).click();
	Select drop=new Select(driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect2\"]")));
	drop.selectByVisibleText("Reading");
	Select office=new Select(driver.findElement(By.xpath("//select[@name=\"department\"]")));
	office.selectByVisibleText("Department of Engineering");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("anusri@123");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Anusri@123");
	driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys("Anusri@123");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anusri123@gmail.com");
	driver.findElement(By.xpath("//input[@name=\"contact_no\"]")).sendKeys("632905340344");
	driver.findElement(By.xpath("//textarea[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Nothing");
	driver.findElement(By.xpath("//button[@class=\"btn btn-warning\"]")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.print("Completed");
	
	
}
}
