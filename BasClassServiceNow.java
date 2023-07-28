package july.week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.github.sukgu.Shadow;

public class BasClassServiceNow {
	public ChromeDriver driver;
	public Shadow dom;
	
	@BeforeClass
	public void login() throws InterruptedException
	{
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disabale-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://dev71584.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Lavanya!1");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		dom=new Shadow(driver);
		dom.setImplicitWait(40);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(10);
		dom.findElementByXPath("//span[text()='Incidents']").click();
		
	}
	}


