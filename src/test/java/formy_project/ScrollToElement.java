package formy_project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com");
		WebElement element=driver.findElement(By.linkText("Page Scroll"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		
		WebElement name=driver.findElement(By.id("name"));
		Actions action=new Actions(driver);
		action.moveToElement(name);
		name.sendKeys("Madhavi");
		Thread.sleep(1000);
		WebElement date=driver.findElement(By.id("date"));
		date.sendKeys("06/06/2021");
		Thread.sleep(1000);
		driver.quit();
	}

}
