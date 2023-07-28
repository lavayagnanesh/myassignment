package july.week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewIncident extends BasClassServiceNow {
@Test
	public void NewIncidentTest() throws InterruptedException  {
				//shadow with iframe.First initiate iframe through iframe title and switch
		WebElement iframe = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iframe);
		//call the element which is pointed iframe with shadow
	driver.findElement(By.id("sysverb_new")).click();
		String Incident = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(Incident);
		driver.findElement(By.id("incident.short_description")).sendKeys("Test");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	//locate the frame to default content from iframe
	driver.switchTo().defaultContent();
	//search input field is in shadow dom inside iframe
	//call particular iframe where the text box is located
	dom.setImplicitWait(10);
	WebElement searchBox = dom.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(searchBox);
	//locate thye element after calling iframe
	WebElement searchIncident = driver.findElement(By.xpath("//input[@class='form-control']"));
	
	searchIncident.sendKeys(Incident);
	searchIncident.sendKeys(Keys.ENTER);
	//driver.switchTo().defaultContent();
	//WebElement frame = driver.findElement(By.id("gsft_main"));
	//driver.switchTo().frame(frame);
	//dom.setImplicitWait(10);
	////String text = dom.findElementByXPath("(//tr[@class='list_row list_odd']//a)[2]").getText();
	//System.out.println(text);	
	
	//if (Incident.equals(text)) {
	//	System.out.println("Both are equal");
		
	}
	
	
	
		
	}

