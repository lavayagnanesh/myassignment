package july.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hexaware");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gnaneshwaran");	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Test");	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lavanya123@gmail.com");
	WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select se= new Select(state);
	se.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit Test");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hexaware Private Limited");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanyaa");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	
			
			
			
	
	
	}

}
