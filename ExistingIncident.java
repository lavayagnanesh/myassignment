package july.week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ExistingIncident extends BasClassServiceNow{
@Test
	public  void ExisitingIncidentTest() throws InterruptedException {
		//locate iframe(iframe is inside shadow,so calling iframe with shadow object)
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		//switch to frame
		driver.switchTo().frame(frame);
		//get the particular element (The element is not directly into shadow, so calling iframe into shadow and calling elemnrt in driver)
		driver.findElement(By.xpath("(//a[@class='linked formlink'])[2]")).click();
		 String findElement = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
			System.out.println(findElement);
		//identify the element
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control'][1]"));
		Select dd=new Select(dropdown);
		dd.selectByIndex(0);
		WebElement dropdownstate = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select ddstate=new Select(dropdownstate);
		ddstate.selectByIndex(1);
		 //String IncStatus = driver.findElement(By.id("incident.state")).getAttribute("value");
		 //System.out.println("Incident status is"+IncStatus);
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		//switch to serach box iframe which is in shadow
		dom.setImplicitWait(10);
		WebElement iframesearchbox = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(iframesearchbox);
		WebElement searchDeletedInc = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchDeletedInc.sendKeys(findElement);
		searchDeletedInc.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		String IncStatus = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
		System.out.println(IncStatus);
		if (IncStatus.equals("In Progress")) 
		{
			System.out.println("Stautus is updated as Inprogress");
		}
		else {
			System.out.println("Stautus is not updated as Inprogress");
		}
	

}}
