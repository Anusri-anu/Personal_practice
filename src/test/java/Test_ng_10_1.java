import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_ng_10_1 {

	public static void main(String[] args) {
		String paths=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", paths+"/Drivers/first/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),\"My Account\")]"))).click();

		//driver.findElement(By.xpath("//*[contains(text(),\"My Account\")]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Register\")]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Anusri");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Anusri");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("anusri18@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("9876654321");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Anusri@123");
		driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys("Anusri@123");
		
		driver.findElement(By.xpath("//input[@name=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class=\"nav pull-right\"]//li[@class=\"dropdown\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Logout\")]")).click();
		
		System.out.println("Completed");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			
			
			
			
			
			e.printStackTrace();
		}
		driver.close();
		
		
		
	}

}
