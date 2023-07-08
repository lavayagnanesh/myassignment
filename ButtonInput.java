package july.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.leafground.com/input.xhtml");
		//driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'][1]")).sendKeys("Lavanya");
		//driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).clear();
		//driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city']")).sendKeys("Namakkal");
		//Error//System.out.println(driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']/following::input")).isEnabled());
		
		//driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]")).clear();
		System.out.println(driver.findElement(By.xpath(
				"(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]"
				)).getText());
		
		
	}

}
