package formy_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com");
		WebElement element=driver.findElement(By.linkText("Datepicker"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(2000);
		WebElement datefield=driver.findElement(By.id("datepicker"));
		//datefield.sendKeys("04/12/2020");
		datefield.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.quit();
	}

}
