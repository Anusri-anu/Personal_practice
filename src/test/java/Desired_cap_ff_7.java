import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired_cap_ff_7 {
	public static void main(String s[])
	{
		String paths=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", paths+"/Drivers/Firefox/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    DesiredCapabilities cap =new DesiredCapabilities();
	    cap.setCapability("browsername", "firefox");
	    cap.setCapability("version", "60.0");
	    cap.setCapability("plotform", "win10");
	    driver.manage().window().maximize();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.print("Completed");
	    driver.close();
	}

}
