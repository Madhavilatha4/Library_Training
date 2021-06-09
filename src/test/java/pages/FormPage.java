package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FormPage {
	public static void submitform(WebDriver driver) {
		driver.findElement(By.id("first-name")).sendKeys("Madhavi");
		driver.findElement(By.id("last-name")).sendKeys("Nukala");
		driver.findElement(By.id("job-title")).sendKeys("Engineer");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.cssSelector("option[value='2']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("9/6/2021");
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}
	

	

}
