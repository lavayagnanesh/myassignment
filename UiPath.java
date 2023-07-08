package july.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//div[@class='main-container']//button")).click();
		System.out.println("driver.getCurrentUrl()");
		driver.findElement(By.xpath("(//div[@class='collapse navbar-collapse']//a)[3]")).click();
		driver.close();
		
		
		//driver.findElement(By.xpath("")).sendKeys("");
		
		
	}

}
