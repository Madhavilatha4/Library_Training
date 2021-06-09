package formy_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ExecuteJavascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com");
		WebElement element=driver.findElement(By.linkText("Modal"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		WebElement openmodel=driver.findElement(By.id("modal-button"));
		openmodel.click();
		Thread.sleep(1000);
		WebElement closeButton=driver.findElement(By.id("close-button"));
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].click();",closeButton);
		Thread.sleep(1000);
		driver.quit();
	}

}
