import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class single_frame_5 {
	public static void main(String s[])
	{
		String paths=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", paths+"/Drivers/first/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//*[contains(text(),'Iframe with in an Iframe')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\\\"Multiple\\\"]//iframe[@src=\\\"MultipleFrames.html\\\"]")).click();
		//driver.switchTo().frame("//*[@id=\"Multiple\"]//iframe[@src=\"MultipleFrames.html\"]");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("IFrame Training");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'Iframe with in an Iframe')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
