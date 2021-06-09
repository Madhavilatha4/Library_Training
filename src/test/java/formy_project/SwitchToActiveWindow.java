package formy_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToActiveWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com");
		WebElement element=driver.findElement(By.linkText("Switch Window"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		WebElement newtabButton =driver.findElement(By.id("new-tab-button"));
		newtabButton.click();
		Thread.sleep(3000);
		String originalHandle =driver.getWindowHandle();
		for(String handle1:driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			Thread.sleep(3000);
			WebElement alertbutton=driver.findElement(By.id("alert-button"));
			alertbutton.click();
			Alert alert=driver.switchTo().alert();
			Thread.sleep(3000);
			alert.accept();
			Thread.sleep(3000);
		}
		
		driver.switchTo().window(originalHandle);
	
		driver.quit();

	}

}
