package july.week5.day2;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends BasClassServiceNow {
@Test
	public void DeleteIncidentTest() throws InterruptedException {
	
		//ChromeDriver driver=new ChromeDriver();
		//locate iframe(iframe is inside shadow,so calling iframe with shadow object)
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		//switch to frame
		driver.switchTo().frame(frame);
		//get the particular element (The element is not directly into shadow, so calling iframe into shadow and calling elemnrt in driver)
		driver.findElement(By.xpath("(//a[@class='linked formlink'])[3]")).click();
		
		//getting incident number
		 String findElement = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(findElement);
		//Delete button
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.switchTo().defaultContent();
		dom.setImplicitWait(10);
		WebElement DeleteButton = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(DeleteButton);
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		driver.switchTo().defaultContent();
		//switch to serach box iframe which is in shadow
		dom.setImplicitWait(10);
		WebElement iframesearchbox = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(iframesearchbox);
		WebElement searchDeletedInc = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchDeletedInc.sendKeys(findElement);
		searchDeletedInc.sendKeys(Keys.ENTER);
		String NoRecordText = driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
		System.out.println(NoRecordText);
		if (NoRecordText.equals("No records to display"))
		{
			System.out.println("Searched incident deleted already");
		}
		
	}}
