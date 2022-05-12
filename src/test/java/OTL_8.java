import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OTL_8 {
	public static void main(String s[])
	{
		String paths=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", paths+"/Drivers/first/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://otl-soprasteria.opc.oracleoutsourcing.com/OA_HTML/AppsLocalLogin.jsp");
		driver.findElement(By.xpath("//input[@id=\"usernameField\"]")).sendKeys("momonisha");
		driver.findElement(By.xpath("//input[@id=\"passwordField\"]")).sendKeys("Welcomesopra@2022567");
		driver.findElement(By.xpath("//div[@id=\"ButtonBox\"]//*[contains(text(),\"Log In\")]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
