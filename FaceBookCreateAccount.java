package july.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Magizhya!1");
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(element);
		day.selectByValue("5");
		WebElement element1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(element1);
		month.selectByValue("Jul");
		WebElement element2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(element2);
		year.selectByValue("1994");
		driver.findElement(By.xpath("//label[contains(text(),Female)]")).click();
		
		
		
		
		
		//driver.findElement(By.xpath("")).sendKeys("");
		
	}

}
